import Controller.*;
import View.Affichage;

public class arch_log {
    public static void main(String[] args) {

        System.out.println("Welcome to Architecture logiciel project");
        PersonController personController = new PersonController();
        RoomController roomController = new RoomController();
        TimeSlotController timeSlotController = new TimeSlotController();
        ReservationController reservationController = new ReservationController();

//        ArrayList<Person> listPerson = personController.getListPerson();
//        for(Person person: listPerson) {
//            System.out.println(person);
//        }
//        System.out.println("");
//
//        Person add1 = new Person("Victor", "Ferraton");
//        personController.addPerson(add1);
//
//        listPerson = personController.getListPerson();
//        for(Person person: listPerson) {
//            System.out.println(person);
//        }
//        System.out.println("");
//
//        Person supp1 = new Person("3", "Victor", "Ferraton");
//        personController.deletePerson(supp1);
//
//        listPerson = personController.getListPerson();
//        for(Person person: listPerson) {
//            System.out.println(person);
//        }
//        System.out.println("");


        /*****************************************/

//        ArrayList<Room> listRoom = roomController.getListRoom();
//        for (Room room : listRoom) {
//            System.out.println(room.getIdRoom() + " " + room.getCapacity());
//        }
//        System.out.println();

//        Room add2 = new Room("40");
//        roomController.addRoom(add2);
//
//        listRoom = roomController.getListRoom();
//        for (Room room : listRoom) {
//            System.out.println(room.getIdRoom() + " " + room.getCapacity());
//        }
//        System.out.println();

//        Room supp2 = new Room("3", "40");
//        roomController.deleteRoom(supp2);
//
//        listRoom = roomController.getListRoom();
//        for (Room room : listRoom) {
//            System.out.println(room.getIdRoom() + " " + room.getCapacity());
//        }
//        System.out.println();

        /*****************************************/

//        ArrayList<TimeSlot> listTimeSlot = timeSlotController.getListTimeSlot();
//        for (TimeSlot timeSlot : listTimeSlot) {
//            System.out.println(timeSlot.getIdTimeSlot() + " " + timeSlot.getDateTimeSlot() + " " + timeSlot.getStartTimeSlot() + " " + timeSlot.getEndTimeSlot());
//        }
//
//        TimeSlot add3 = new TimeSlot("21/11", "8h00", "12h00");
//        timeSlotController.addTimeSlot(add3);
//
//        listTimeSlot = timeSlotController.getListTimeSlot();
//        for (TimeSlot i : listTimeSlot) {
//            System.out.println(i.getIdTimeSlot() + " " + i.getDateTimeSlot() + " " + i.getStartTimeSlot() + " " + i.getEndTimeSlot());
//        }
//
//        TimeSlot supp3 = new TimeSlot("3", "21/11", "8h00", "12h00");
//        timeSlotController.deleteTimeSlot(supp3);
//
//        listTimeSlot = timeSlotController.getListTimeSlot();
//        for (TimeSlot i : listTimeSlot) {
//            System.out.println(i.getIdTimeSlot() + " " + i.getDateTimeSlot() + " " + i.getStartTimeSlot() + " " + i.getEndTimeSlot());
//        }

        /******************************************/

//        ArrayList<Reservation> listReservation = reservationController.getListReservation();
//        for (Reservation reservation : listReservation) {
//            System.out.println(reservation.getIdPerson() + " " + reservation.getIdRoom() + " " + reservation.getIdTimeSlot());
//        }
//        System.out.println();

//        Reservation add4 = new Reservation("1", "2", "1");
//        reservationController.addReservation(add4);
//
//        listReservation = reservationController.getListReservation();
//        for (Reservation reservation : listReservation) {
//            System.out.println(reservation.getIdPerson() + " " + reservation.getIdRoom() + " " + reservation.getIdTimeSlot());
//        }
//        System.out.println();

//        Reservation supp4 = new Reservation("2", "1", "1");
//        reservationController.deleteReservation(supp4);
//
//        listReservation = reservationController.getListReservation();
//        for (Reservation reservation : listReservation) {
//            System.out.println(reservation.getIdPerson() + " " + reservation.getIdRoom() + " " + reservation.getIdTimeSlot());
//        }
//        System.out.println();


//        Reservation alter1 = new Reservation("2", "1", "2");
//        reservationController.changeReservation(alter1);
//
//        listReservation = reservationController.getListReservation();
//        for (Reservation reservation : listReservation) {
//            System.out.println(reservation.getIdPerson() + " " + reservation.getIdRoom() + " " + reservation.getIdTimeSlot());
//        }
//        System.out.println();

        /******************************************/

        Affichage jd = new Affichage();
        jd.Fenetre();

    }
}

