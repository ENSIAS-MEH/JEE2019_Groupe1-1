package com.projet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import com.projet.beans.Utilisateur;

public class UserDao {
	
	String sql = "select * from utilisateur where  email = ?";
	String url = "jdbc:mysql://localhost:3306/projet_jee?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	String nomutilisateur ="java";
	String password = "allenwalker123";
	String driver ="com.mysql.jdbc.Driver";
	Utilisateur user ;
	
	
	
	public Utilisateur Renvoi(String email) {
		try {
		Class.forName( driver );
		Connection con = DriverManager.getConnection(url,nomutilisateur,password);
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, email);
		ResultSet rs = st.executeQuery();
		
		   while( rs.next()) {
		    Long idUtilisateur = rs.getLong( "id_utilisateur" );
		    String emailUtilisateur = rs.getString( "email" );
		    String motDePasseUtilisateur = rs.getString( "mot_de_passe" );
		    String nomUtilisateur = rs.getString( "nom" );
		    user =new Utilisateur();
		    user.setEmail(emailUtilisateur);
		    user.setId(idUtilisateur);
		    user.setNom(nomUtilisateur);
		    user.setMotDePasse(motDePasseUtilisateur);
		   }
		}catch (Exception e) {
			e.printStackTrace();
	  }
		
		return user;
		
		
}
}
