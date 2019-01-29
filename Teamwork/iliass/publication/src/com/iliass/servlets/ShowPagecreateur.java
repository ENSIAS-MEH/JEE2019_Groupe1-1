package com.iliass.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iliass.dao.DAOPublication;
import com.iliass.models.Publication;

/**
 * Servlet implementation class ShowPagecreateur
 */
@WebServlet("/ShowPagecreateur")
public class ShowPagecreateur extends HttpServlet {
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		DAOPublication daoPublication = new DAOPublication() ;
	     
	    List<Publication> listPubs = daoPublication.getAllPosts() ;
	    
	     
	    
	    HttpSession session = request.getSession() ;
 		session.setAttribute("listPubs", listPubs);
 		
		response.sendRedirect("pagecreateur.jsp");
		
	}

	

}
