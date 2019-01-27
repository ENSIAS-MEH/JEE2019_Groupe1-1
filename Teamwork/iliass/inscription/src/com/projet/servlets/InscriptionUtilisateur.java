package com.projet.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.projet.beans.Utilisateur;
import com.projet.dao.UtilisateurDao;

/**
 * Servlet implementation class InscriptionUtilisateur
 */
@WebServlet("/InscriptionUtilisateur")
public class InscriptionUtilisateur extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UtilisateurDao dao = new UtilisateurDao() ;
		Utilisateur utilisateur = new Utilisateur() ;
		
		
		utilisateur.setNom(request.getParameter("name"));
		utilisateur.setEmail(request.getParameter("email"));
		utilisateur.setPasse(request.getParameter("password"));
		
		dao.addUtilisateur(utilisateur);
		
	}

	

}
