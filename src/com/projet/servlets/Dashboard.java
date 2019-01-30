package com.projet.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.projet.beans.Utilisateur;
import com.projet.dao.DAOPublication;
import com.projet.dao.LoginDao;
import com.projet.forms.ConnexionForm;

public class Dashboard extends HttpServlet {
    public static final String ATT_USER         = "utilisateur";
    public static final String ATT_FORM         = "form";
    public static final String ATT_SESSION_USER = "sessionUtilisateur";
    public static final String VUE              = "/dashboard.jsp";
    public static final String ACCES_RESTREINT  = "/restriction";

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /* Affichage de la page de connexion */
    	
    
    	  HttpSession session = request.getSession();
    	  String sessionUser= (String)session.getAttribute("idString");
          int param = Integer.parseInt(sessionUser);
          DAOPublication daopubli = new DAOPublication();
          int benef = daopubli.argent(param);
          
          

      	session.setAttribute( "benef_ATT", benef );      

        /**
         * Si aucune erreur de validation n'a eu lieu, alors ajout du bean
         * Utilisateur à la session, sinon suppression du bean de la session.
         */
       
       
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

}