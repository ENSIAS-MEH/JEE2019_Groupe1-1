package com.projet.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.projet.beans.Publication;
import com.projet.dao.DAOPublication;

public class Myservlet extends HttpServlet {
    
    public static final String ACCES_PAGE    = "/pagecreateurconsult.jsp";
    

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /* Récupération et destruction de la session en cours */
        HttpSession session = request.getSession();
        //int paramId = Integer.parseInt(request.getParameter("add"));
        
        DAOPublication daopublication = new DAOPublication();
        List<Publication> listspPosts = daopublication.getSpecificPoste(1) ;
        session.setAttribute( "listspPosts", listspPosts );
        
      

        /* Redirection vers le Site du Zéro ! */
        this.getServletContext().getRequestDispatcher( ACCES_PAGE ).forward( request, response );   }
}