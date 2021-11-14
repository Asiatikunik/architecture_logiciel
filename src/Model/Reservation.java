package Model;

public class Reservation {
    public int idPerson;
    public int idRoom;
    public int idTimeSlot;

    public Reservation(int idPerson, int idRoom, int idTimeSlot) {
        this.idPerson = idPerson;
        this.idRoom = idRoom;
        this.idTimeSlot = idTimeSlot;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public int getIdTimeSlot() {
        return idTimeSlot;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public void setIdTimeSlot(int idTimeSlot) {
        this.idTimeSlot = idTimeSlot;
    }
}
