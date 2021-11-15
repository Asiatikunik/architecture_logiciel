package Controller;

import Model.Person;

import java.sql.*;
import java.util.ArrayList;

public class PersonController {
    Connection conn;

    /*
        Requete en base pour montrer tout les personnes
     */
    public ArrayList<Person> getListPerson() {
        ArrayList<Person> returned = new ArrayList<>();
        String query = "SELECT * FROM person";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/architecture_logiciel","root","");
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                Person person = new Person(rs.getString("firstname"), rs.getString("lastname"));
                returned.add(person);
            }
            rs.close();
            statement.close();
            conn.close();
        }catch(SQLException e) {
            System.err.println(e);
        }
        return returned;
    }

    /*
        Requete en base pour ajouter une personne
     */
    public void addPerson(Person person) {
        String query = "INSERT INTO Person VALUES (?,?,?)";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/architecture_logiciel","root","");
            PreparedStatement statement = conn.prepareStatement(query);

            statement.setString(1, person.getIdPerson());
            statement.setString(2, person.getFirstname());
            statement.setString(3, person.getLastname());
            statement.executeUpdate();

            statement.close();
            conn.close();
        }catch(SQLException e) {
            System.err.println(e);
        }
    }

    /*
        Requete en base pour supprimer une personne
     */
    public void deletePerson(Person person) {
        String query = "DELETE FROM `person` WHERE `idPerson` LIKE ?";

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/architecture_logiciel","root","");
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, person.getIdPerson());
            statement.executeUpdate();
            statement.close();
            conn.close();
        } catch (SQLException var8) {
            System.err.println(var8.getMessage());
        }
    }

}
