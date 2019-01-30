package com.projet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.projet.beans.Utilisateur;

public class UtilisateurDA {
	
	String url = "jdbc:mysql://localhost:3306/projet_jee?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	String nomutilisateur ="java";
	String password = "allenwalker123";
	String driver ="com.mysql.jdbc.Driver";
	
	
	public List<Utilisateur> getAllUsers(){
		List<Utilisateur> listUsers = new ArrayList<Utilisateur>() ;
		
		try {
			
			Class.forName(driver) ;
			Connection con = DriverManager.getConnection(url,nomutilisateur, password) ;
			Statement st = con.createStatement() ;
			ResultSet rs = st.executeQuery("select * from Utilisateur") ;
			
			while(rs.next()) {
				Utilisateur utilisateur = new Utilisateur() ;
				
				utilisateur.setNom(rs.getString("nom")) ;
				utilisateur.setEmail(rs.getString("email")) ;
				utilisateur.setAbout_me(rs.getString("about_me"));
				listUsers.add(utilisateur) ;
 			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listUsers ;
	}

}
