package Controller;

import java.sql.*;

public class Person {

//    public Connect_db connect_db = new Connect_db();
    Connection conn;

    public void afficherPerson() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/architecture_logiciel","root","");
            Statement stmt = conn.createStatement();
            ResultSet RS = stmt.executeQuery("SELECT idPerson,firstname,lastname FROM person");
            while(RS.next()) {
                System.out.print(RS.getString("idPerson"));
                System.out.println(" ");
                System.out.print(RS.getString("firstname"));
                System.out.println(" ");
                System.out.println(RS.getString("lastname"));
            }
            RS.close();
            stmt.close();
            conn.close();

        }catch(SQLException e) {
            System.err.println(e);
        }
    }
}
