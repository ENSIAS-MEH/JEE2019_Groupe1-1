package com.projet.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.projet.dao.DAOPublication;
import com.projet.forms.Publication;

/**
 * Servlet implementation class ShowPubs
 */
@WebServlet("/ShowPubs")
public class ShowPubs extends HttpServlet {

	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 Publication pub1 = new Publication() ;  
	     Publication pub2 = new Publication() ;
	    
	     
	    /* 
		pub1.setIdPublication(1);
		pub1.setTitre("titra 1");
		pub1.setDescription("description1");
		
		pub2.setIdPublication(2);
		pub2.setTitre("titre2");
		pub2.setDescription("description 2") ;
		
		List<Publication> list = new ArrayList<Publication>() ;
		list.add(pub1) ;
		list.add(pub2) ;
		*/
	     
	     DAOPublication daoPublication = new DAOPublication() ;
	     
	     List<Publication> list = daoPublication.getAllPosts() ;
		
 		HttpSession session = request.getSession() ;
 		session.setAttribute("list", list);
 		response.sendRedirect("Publications.jsp") ;
	}


}
