package Model;

public class Reservation {
    public String idPerson;
    public String idRoom;
    public String idTimeSlot;

    public Reservation(String idPerson, String idRoom, String idTimeSlot) {
        this.idPerson = idPerson;
        this.idRoom = idRoom;
        this.idTimeSlot = idTimeSlot;
    }

    public String getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    public String getIdTimeSlot() {
        return idTimeSlot;
    }

    public void setIdTimeSlot(String idTimeSlot) {
        this.idTimeSlot = idTimeSlot;
    }
}
