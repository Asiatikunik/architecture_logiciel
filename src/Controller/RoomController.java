package Controller;

import Model.Room;

import java.sql.*;
import java.util.ArrayList;
import java.sql.DriverManager;

public class RoomController {

        Connection conn;

        /*
            Requete en base qui permet de afficher tous les salles
         */
        public ArrayList<Room> getListRoom() {
        ArrayList<Room> returned = new ArrayList<>();
        String query = "SELECT * FROM room";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/architecture_logiciel","root","");
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                Room room = new Room(rs.getString("idRoom"), rs.getString("capacity"));
                returned.add(room);
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
        Requete en base qui permet de ajouter une salle
     */
    public void addRoom(Room room) {
        String query = "INSERT INTO room VALUES (?,?)";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/architecture_logiciel","root","");
            PreparedStatement statement = conn.prepareStatement(query);

            statement.setString(1, room.getIdRoom());
            statement.setString(2, room.getCapacity());
            statement.executeUpdate();

            statement.close();
            conn.close();
        }catch(SQLException e) {
            System.err.println(e);
        }
    }

    /*
        Requete en base qui permet de supprimer une salle
     */
    public void deleteRoom(Room room) {
        String query = "DELETE FROM `room` WHERE `idRoom` LIKE ?";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/architecture_logiciel","root","");
            PreparedStatement statement = conn.prepareStatement(query);

            statement.setString(1, room.getIdRoom());
            statement.executeUpdate();

            statement.close();
            conn.close();
        }catch(SQLException e) {
            System.err.println(e);
        }
    }

}
