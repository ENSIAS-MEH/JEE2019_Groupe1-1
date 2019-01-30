package com.projet.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.projet.beans.Utilisateur;
import com.projet.dao.DAOFactory;
import com.projet.dao.LoginDao;
import com.projet.dao.UserDao;
import com.projet.dao.UtilisateurDao;
import com.projet.forms.ConnexionForm;

public class User extends HttpServlet {
    public static final String ACCES_PUBLIC     = "/accesPublic.jsp";
    public static final String VUE              = "/WEB-INF/user.jsp";
    public static final String ATT_SESSION_USER = "sessionUtilisateur";
    public static final String CONF_DAO_FACTORY = "daofactory";
    public static final String ATT_USER         = "utilisateur";
    public static final String ATT_FORM         = "form";
    public static final String ATT_STRING       = "idString";

    
    private Utilisateur utilisateur;
    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
    	
        HttpSession session = request.getSession();
        Utilisateur sessionUser=(Utilisateur) session.getAttribute(ATT_SESSION_USER);
    	String emailUtilisateur = sessionUser.getEmail();
    	UserDao dao = new UserDao();
        utilisateur = dao.Renvoi(emailUtilisateur);
        String numberAsString = Long.toString(utilisateur.getId());
        
        

        
        /*
         * Si l'objet utilisateur n'existe pas dans la session en cours, alors
         * l'utilisateur n'est pas connecté.
         */
      
            /* Redirection vers la page publique */
        	request.setAttribute( ATT_USER, utilisateur );
        	session.setAttribute( ATT_SESSION_USER, utilisateur );
        	session.setAttribute( ATT_STRING, numberAsString );

        	this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
      
          
        }
    }
