package com.projet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.projet.forms.Publication;

public class DAOPublication {

	public List<Publication> getAllPosts(){
		
		List<Publication> listPosts = new ArrayList<Publication>() ;
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver") ;
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetEE", "java", "iliass123") ;
			Statement st = con.createStatement() ;
			ResultSet rs = st.executeQuery("select * from Postes") ;
			
			
			while (rs.next()) {
				Publication publication = new Publication() ;
				publication.setIdPublication(rs.getInt("id_Poste"));
				publication.setTitre(rs.getString("Titre"));
				publication.setDescription(rs.getString("Description"));
				publication.setIdPublisher(rs.getInt("id_posteur"));
				publication.setURL(rs.getString("URL"));
				publication.setPublicPost(rs.getInt("public"));
				
				listPosts.add(publication) ;
 			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		return listPosts ;
	}

}
