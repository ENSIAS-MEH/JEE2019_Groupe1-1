package com.projet.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.projet.beans.Utilisateur;
import com.projet.dao.LoginDao;
import com.projet.forms.ConnexionForm;

public class Dashboard extends HttpServlet {
    public static final String ATT_USER         = "utilisateur";
    public static final String ATT_FORM         = "form";
    public static final String ATT_SESSION_USER = "sessionUtilisateur";
    public static final String VUE              = "/WEB-INF/Dashboard.jsp";
    public static final String ACCES_RESTREINT  = "/restriction";

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /* Affichage de la page de connexion */
    	
    	
    	 /* Pr�paration de l'objet formulaire */
        ConnexionForm form = new ConnexionForm();

        /* Traitement de la requ�te et r�cup�ration du bean en r�sultant */
        Utilisateur utilisateur = form.connecterUtilisateur( request );
        
        LoginDao dao = new LoginDao();

        /* R�cup�ration de la session depuis la requ�te */
        HttpSession session = request.getSession();

        /**
         * Si aucune erreur de validation n'a eu lieu, alors ajout du bean
         * Utilisateur � la session, sinon suppression du bean de la session.
         */
        if ( form.getErreurs().isEmpty() && dao.check(utilisateur.getEmail(), utilisateur.getMotDePasse()) ) {
        	request.setAttribute( ATT_FORM, form );
            request.setAttribute( ATT_USER, utilisateur );
        	session.setAttribute( ATT_SESSION_USER, utilisateur );
            response.sendRedirect( request.getContextPath() + ACCES_RESTREINT );
        } else {
            session.setAttribute( ATT_SESSION_USER, null );
        }
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

}