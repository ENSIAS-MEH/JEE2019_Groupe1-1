package com.projet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	
	String sql = "select * from utilisateur where  email = ? and mot_de_passe = ?";
	String url = "jdbc:mysql://localhost:3306/projet_jee?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	String nomutilisateur ="java";
	String password = "allenwalker123";
	String driver ="com.mysql.jdbc.Driver";
	
	public boolean check(String email, String motdepasse) {
		try {
		Class.forName( driver );
		Connection con = DriverManager.getConnection(url,nomutilisateur,password);
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, email);
		st.setString(2, motdepasse);
		ResultSet rs = st.executeQuery();
		if( rs.next()) {
			
			
			return true;
		}
		}catch (Exception e) {
			e.printStackTrace();
	  }
		return false;
}
}
