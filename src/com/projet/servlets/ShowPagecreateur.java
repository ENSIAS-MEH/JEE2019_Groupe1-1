package com.projet.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.projet.dao.DAOPublication;
import com.projet.beans.Publication;

/**
 * Servlet implementation class ShowPagecreateur
 */
@WebServlet("/ShowPagecreateur")
public class ShowPagecreateur extends HttpServlet {
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		DAOPublication daoPublication = new DAOPublication() ;
		HttpSession session = request.getSession() ;
		int id_connexion = (int) session.getAttribute("idconnexion") ;
	    List<Publication> listPubs = daoPublication.getSpecificPoste(id_connexion) ;
	    
	     
	    
	    
 		session.setAttribute("listPubs", listPubs);
 		
		response.sendRedirect("pagecreateur.jsp");
		
	}

	

}
