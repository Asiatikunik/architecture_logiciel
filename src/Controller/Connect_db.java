package Controller;

import java.sql.*;

public class Connect_db {
	Connection conn;

	public Connect_db() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Gest_salle","root","");
			Statement stmt = conn.createStatement();
	        ResultSet RS = stmt.executeQuery("SELECT nom,prenom FROM personne");
	        while(RS.next()) {
	        	System.out.println(RS.getString("nom"));
	        }
	        RS.close();
	        stmt.close();
	        conn.close();

		}catch(SQLException e) {
			System.err.println(e);
		}
	}
	Connection obtenirconnect() {return conn; }
}
