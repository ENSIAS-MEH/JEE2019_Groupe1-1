package com.iliass.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.iliass.models.Publication;

public class DAOPublication {
	
	String sql  = "select * from Postes where id_posteur = ?" ;
	String url = "jdbc:mysql://localhost:3306/projetEE" ;
	String username = "java" ;
	String password = "iliass123" ;

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
	
	public List<Publication> getSpecificPoste(int id_Posteur){
		List<Publication> listSpecificPosts = new ArrayList<Publication>() ;
		
		try {
			Class.forName("com.mysql.jdbc.Driver") ;
			Connection con = DriverManager.getConnection(url,username,password) ;
			PreparedStatement st = con.prepareStatement(sql) ;
			st.setInt(1, id_Posteur);
			ResultSet rs =st.executeQuery() ;
 			
			while (rs.next()) {
				Publication publication = new Publication() ;
				publication.setIdPublication(rs.getInt("id_Poste"));
				publication.setTitre(rs.getString("Titre"));
				publication.setDescription(rs.getString("Description"));
				publication.setIdPublisher(rs.getInt("id_posteur"));
				publication.setURL(rs.getString("URL"));
				publication.setPublicPost(rs.getInt("public"));
				
				listSpecificPosts.add(publication) ;
 			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return listSpecificPosts ;
		
	}
	
	
	public void addUserLikePost(int idUser , int idPoste) {
		
		String sqlRequest = "insert into AimerPoste(id_utilisateur, id_Poste) values(?,?)" ;
		
		try {
			Class.forName("com.mysql.jdbc.Driver") ;
			Connection con = DriverManager.getConnection(url,username,password) ;
			PreparedStatement st = con.prepareStatement(sqlRequest) ;
			st.setInt(1, idUser);
			st.setInt(2, idPoste);
			int status = st.executeUpdate() ;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	
	public void addPost( int id_Posteur, String titre, String Desc , String URL) {
		String sqlAddPost = "insert into Postes(id_posteur, Titre, Description,URL) values(?,?,?,?)" ;
		
		try {
			Class.forName("com.mysql.jdbc.Driver") ;
			Connection con = DriverManager.getConnection(url,username,password) ;
			PreparedStatement st = con.prepareStatement(sqlAddPost) ;
			st.setInt(1, id_Posteur);
			st.setString(2, titre);
			st.setString(3, Desc);
			st.setString(4, URL);
			int status = st.executeUpdate() ;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void userSubUser(int id_Posteur ,int id_abonne) {
		String sqlSubUser = "insert into Sabonner(id_posteur,id_abonne) values (?,?)" ;
		
		try {
			Class.forName("com.mysql.jdbc.Driver") ;
			Connection con = DriverManager.getConnection(url,username,password) ;
			PreparedStatement st = con.prepareStatement(sqlSubUser) ;
			st.setInt(1, id_Posteur);
			st.setInt(2, id_abonne);
			int status = st.executeUpdate() ;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
