package Controller;

import Model.Reservation;
import java.sql.*;
import java.util.ArrayList;

public class ReservationController {
    Connection conn;

    /*
        Requete qui permet de montrer tout les réservations
     */
    public ArrayList<Reservation> getListReservation() {
        ArrayList<Reservation> returned = new ArrayList<>();
        String query = "SELECT * FROM reservation";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/architecture_logiciel","root","");
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                Reservation reservation = new Reservation(rs.getString("idPerson"),
                        rs.getString("idRoom"),
                        rs.getString("idTimeSlot"));
                returned.add(reservation);
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
        Requete en base pour ajouter une réservation
     */
    public void addReservation(Reservation reservation) {
        String query = "INSERT INTO Reservation VALUES (?,?,?)";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/architecture_logiciel","root","");
            PreparedStatement statement = conn.prepareStatement(query);

            statement.setString(1, reservation.getIdPerson());
            statement.setString(2, reservation.getIdRoom());
            statement.setString(3, reservation.getIdTimeSlot());
            statement.executeUpdate();

            statement.close();
            conn.close();
        }catch(SQLException e) {
            System.err.println(e);
        }
    }

    /*
        Requete qui permet de supprimer une réservation
     */
    public void deleteReservation(Reservation reservation) {
        String query = " DELETE FROM `Reservation` WHERE `idPerson` LIKE ? AND `idRoom` LIKE ? AND `idTimeSlot` LIKE ?";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/architecture_logiciel","root","");
            PreparedStatement statement = conn.prepareStatement(query);

            statement.setString(1, reservation.getIdPerson());
            statement.setString(2, reservation.getIdRoom());
            statement.setString(3, reservation.getIdTimeSlot());
            statement.executeUpdate();

            statement.close();
            conn.close();
        }catch(SQLException e) {
            System.err.println(e);
        }
    }

    /*
        Requete en base qui permet de changer une réservation
     */
    public void changeReservation(Reservation reservation) {
        String query = "UPDATE `Reservation` SET `idTimeSlot` = ? WHERE `idRoom` LIKE ?  AND `idPerson` LIKE ?";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/architecture_logiciel","root","");
            PreparedStatement statement = conn.prepareStatement(query);

            statement.setString(1, reservation.getIdPerson());
            statement.setString(2, reservation.getIdRoom());
            statement.setString(3, reservation.getIdTimeSlot());
            statement.executeUpdate();

            statement.close();
            conn.close();
        }catch(SQLException e) {
            System.err.println(e);
        }
    }
}
