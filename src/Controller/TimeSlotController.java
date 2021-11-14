package Controller;

import Model.TimeSlot;

import java.sql.*;
import java.util.ArrayList;

public class TimeSlotController {
    Connection conn;

    public ArrayList<TimeSlot> getListTimeSlot() {
        ArrayList<TimeSlot> returned = new ArrayList<>();
        String query = "SELECT * FROM timeSlot";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/architecture_logiciel","root","");
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                TimeSlot timeSlot = new TimeSlot(rs.getString("idTimeSlot"), rs.getString("dateTimeSlot"),
                        rs.getString("startTimeSlot"), rs.getString("endTimeSlot"));
                returned.add(timeSlot);
            }
            rs.close();
            statement.close();
            conn.close();
        }catch(SQLException e) {
            System.err.println(e);
        }
        return returned;
    }

    public void addTimeSlot(TimeSlot timeslot) {
        String query = "INSERT INTO timeslot VALUES (?,?,?,?)";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/architecture_logiciel","root","");
            PreparedStatement statement = conn.prepareStatement(query);

            statement.setString(1, timeslot.getIdTimeSlot());
            statement.setString(2, timeslot.getDateTimeSlot());
            statement.setString(3, timeslot.getStartTimeSlot());
            statement.setString(4, timeslot.getEndTimeSlot());
            statement.executeUpdate();

            statement.close();
            conn.close();
        }catch(SQLException e) {
            System.err.println(e);
        }
    }

    public void deleteTimeSlot(TimeSlot timeslot) {
        String query = "DELETE FROM `TimeSlot` WHERE `idTimeSlot` LIKE ?";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/architecture_logiciel","root","");
            PreparedStatement statement = conn.prepareStatement(query);

            statement.setString(1, timeslot.getIdTimeSlot());
            statement.executeUpdate();

            statement.close();
            conn.close();
        }catch(SQLException e) {
            System.err.println(e);
        }
    }
}
