package com.projet.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.projet.beans.Utilisateur;
import com.projet.dao.UtilisateurDA;

public class Plusieursutilisateur extends HttpServlet {
    
    public static final String ACCES_PUBLIC     = "/pageplusieurscreateur.jsp";
    public static final String ATT_SESSION_LIST     = "listutilisateur";

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /* Récupération et destruction de la session en cours */
    	
    	 HttpSession session = request.getSession();
    	 
    	 UtilisateurDA utilDA = new UtilisateurDA();
       	List<Utilisateur> listUsers = utilDA.getAllUsers();
       	session.setAttribute( "listUsers", listUsers );
    	 
       	
       	
        
        /* Redirection vers le Site du Zéro ! */
        this.getServletContext().getRequestDispatcher( ACCES_PUBLIC ).forward( request, response );   }
}