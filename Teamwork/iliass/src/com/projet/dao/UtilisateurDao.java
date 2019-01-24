package com.projet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.projet.beans.Utilisateur;

public class UtilisateurDao {
	
	public void addUtilisateur(Utilisateur utilisateur) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver") ;
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetEE", "java", "iliass123") ;
			Statement st = con.createStatement() ;
			
			
			String nom = utilisateur.getNom() ;
			String email = utilisateur.getEmail() ;
			String passe = utilisateur.getPasse() ;
			
			st.executeUpdate("insert into Utilisateur (nom_utilisateur,email,mot_de_passe) values('"+    nom        +"' ,'"+ email  +"',MD5('"+ passe  +"')) ;") ;
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
