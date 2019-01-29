package com.projet.forms;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.jasypt.util.password.ConfigurablePasswordEncryptor;

import com.projet.beans.Utilisateur;
import com.projet.dao.DAOException;
import com.projet.dao.UtilisateurDao;

public final class InfoForm {
    private static final String CHAMP_PSEUDO  = "pseudo";
    private static final String CHAMP_ADRESSE = "adresse";
    private static final String CHAMP_PAYS  = "pays";
    private static final String CHAMP_CODE_POSTAL  = "code_postal";
    private static final String CHAMP_TYPE_CONTENU = "type_contenu";
    private static final String CHAMP_LIEN  = "lien";
    private static final String CHAMP_ABOUT_ME = "about_me";
    public static final String ATT_SESSION_USER = "sessionUtilisateur";

    private String              resultat;
    private Map<String, String> erreurs      = new HashMap<String, String>();
    private UtilisateurDao      utilisateurDao;
    
    
    
    public InfoForm( UtilisateurDao utilisateurDao ) {

        this.utilisateurDao = utilisateurDao;

    }
    public String getResultat() {
        return resultat;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }
    
    public Utilisateur inscrireUtilisateur( HttpServletRequest request ) {
    String pseudo = getValeurChamp( request, CHAMP_PSEUDO );
    String adresse = getValeurChamp( request, CHAMP_ADRESSE );
    String pays = getValeurChamp( request, CHAMP_PAYS );
    String codepostal = getValeurChamp( request, CHAMP_CODE_POSTAL );
    String typecontenu = getValeurChamp( request, CHAMP_TYPE_CONTENU );
    String lien = getValeurChamp( request, CHAMP_LIEN );
    String aboutme = getValeurChamp( request, CHAMP_ABOUT_ME );
    HttpSession session=request.getSession();
    Utilisateur sessionUser=(Utilisateur) session.getAttribute(ATT_SESSION_USER);
	String email = sessionUser.getEmail();
	
    Utilisateur utilisateur = new Utilisateur();
    
    utilisateur.setPseudo(pseudo);
    utilisateur.setAdresse(adresse);
    utilisateur.setPays(pays);
    utilisateur.setCode_postal(codepostal);
    utilisateur.setType_contenu(typecontenu);
    utilisateur.setLien(lien);
    utilisateur.setAbout_me(aboutme);
    utilisateur.setEmail(email);
    
    utilisateurDao.ajouter( utilisateur );
    
    return utilisateur;
    }

    
    private static String getValeurChamp( HttpServletRequest request, String nomChamp ) {
        String valeur = request.getParameter( nomChamp );
        if ( valeur == null || valeur.trim().length() == 0 ) {
            return null;
        } else {
            return valeur.trim();
        }
    }

}