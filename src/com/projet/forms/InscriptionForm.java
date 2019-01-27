package com.projet.forms;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import org.jasypt.util.password.ConfigurablePasswordEncryptor;

import com.projet.beans.Utilisateur;
import com.projet.dao.DAOException;
import com.projet.dao.UtilisateurDao;

public final class InscriptionForm {
    private static final String CHAMP_EMAIL  = "email";
    private static final String CHAMP_PASS   = "motdepasse";
    private static final String CHAMP_CONF   = "confirmation";
    private static        final String CHAMP_NOM    = "nom";

    private String              resultat;
    private Map<String, String> erreurs      = new HashMap<String, String>();
    private UtilisateurDao      utilisateurDao;
    
    private static final String ALGO_CHIFFREMENT = "SHA-256";
    
    public InscriptionForm( UtilisateurDao utilisateurDao ) {

        this.utilisateurDao = utilisateurDao;

    }
    public String getResultat() {
        return resultat;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }
    
    public Utilisateur inscrireUtilisateur( HttpServletRequest request ) {
    String email = getValeurChamp( request, CHAMP_EMAIL );
    String motDePasse = getValeurChamp( request, CHAMP_PASS );
    String confirmation = getValeurChamp( request, CHAMP_CONF );
    String nom = getValeurChamp( request, CHAMP_NOM );

    Utilisateur utilisateur = new Utilisateur();
    try {
        traiterEmail( email, utilisateur );
        traiterMotsDePasse( motDePasse, confirmation, utilisateur );
        traiterNom( nom, utilisateur );

        if ( erreurs.isEmpty() ) {
            utilisateurDao.creer( utilisateur );
            resultat = "Succ�s de l inscription.";
        } else {
            resultat = "�chec de l'inscription.";
        }
    } catch ( DAOException e ) {
        resultat = "�chec de l'inscription : une erreur impr�vue est survenue, merci de r�essayer dans quelques instants.";
        e.printStackTrace();
    }

    return utilisateur;
}

    /*

     * Appel � la validation de l'adresse email re�ue et initialisation de la

     * propri�t� email du bean

     */

    private void traiterEmail( String email, Utilisateur utilisateur ) {

        try {

            validationEmail( email );

        } catch ( FormValidationException e ) {

            setErreur( CHAMP_EMAIL, e.getMessage() );

        }

        utilisateur.setEmail( email );

    }

    private void traiterNom( String nom, Utilisateur utilisateur ) {

        try {

            validationNom( nom );

        } catch ( FormValidationException e ) {

            setErreur( CHAMP_EMAIL, e.getMessage() );

        }

        utilisateur.setNom( nom );

    }

    /*

     * Appel � la validation des mots de passe re�us, chiffrement du mot de

     * passe et initialisation de la propri�t� motDePasse du bean

     */

    private void traiterMotsDePasse( String motDePasse, String confirmation, Utilisateur utilisateur ) {

        try {
        	
            validationMotsDePasse( motDePasse, confirmation );
            
        } catch ( FormValidationException e ) {

            setErreur( CHAMP_PASS, e.getMessage() );

            setErreur( CHAMP_CONF, null );

        }


        /*

         * Utilisation de la biblioth�que Jasypt pour chiffrer le mot de passe

         * efficacement.

         * 

         * L'algorithme SHA-256 est ici utilis�, avec par d�faut un salage

         * al�atoire et un grand nombre d'it�rations de la fonction de hashage.

         * 

         * La String retourn�e est de longueur 56 et contient le hash en Base64.

         */

        ConfigurablePasswordEncryptor passwordEncryptor = new ConfigurablePasswordEncryptor();

        passwordEncryptor.setAlgorithm( ALGO_CHIFFREMENT );

        passwordEncryptor.setPlainDigest( false );

        String motDePasseChiffre = passwordEncryptor.encryptPassword( motDePasse );


        utilisateur.setMotDePasse( motDePasseChiffre );

    }


    /* Validation de l'adresse email */

    private void validationEmail( String email ) throws FormValidationException {

        if ( email != null ) {

            if ( !email.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) ) {

                throw new FormValidationException( "Merci de saisir une adresse mail valide." );

            } else if ( utilisateurDao.trouver( email ) != null ) {

                throw new FormValidationException( "Cette adresse email est d�j� utilis�e, merci d'en choisir une autre." );

            }

        } else {

            throw new FormValidationException( "Merci de saisir une adresse mail." );

        }

    }
    
    
   
    private void validationMotsDePasse( String motDePasse, String confirmation ) throws FormValidationException {
        if ( motDePasse != null && confirmation != null ) {
            if ( !motDePasse.equals( confirmation ) ) {
                throw new FormValidationException( "Les mots de passe entr�s sont diff�rents, merci de les saisir � nouveau." );
            } else if ( motDePasse.length() < 3 ) {
                throw new FormValidationException( "Les mots de passe doivent contenir au moins 3 caract�res." );
            }
        } else {
            throw new FormValidationException( "Merci de saisir et confirmer votre mot de passe." );
        }
    }

    private void validationNom( String nom ) throws FormValidationException {
        if ( nom != null && nom.length() < 3 ) {
            throw new FormValidationException( "Le nom d'utilisateur doit contenir au moins 3 caract�res." );
        }
    }

    /*
     * Ajoute un message correspondant au champ sp�cifi� � la map des erreurs.
     */
    private void setErreur( String champ, String message ) {
        erreurs.put( champ, message );
    }

    /*
     * M�thode utilitaire qui retourne null si un champ est vide, et son contenu
     * sinon.
     */
    private static String getValeurChamp( HttpServletRequest request, String nomChamp ) {
        String valeur = request.getParameter( nomChamp );
        if ( valeur == null || valeur.trim().length() == 0 ) {
            return null;
        } else {
            return valeur.trim();
        }
    }

}