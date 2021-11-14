package Controller;

import java.sql.*;

public class Connect_db {
	Connection conn;

	public Connect_db() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}
	}

	Connection obtenirConnect() {return conn; }
}
