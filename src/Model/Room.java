package Model;

public class Room {
    public String idRoom;
    public String capacity;

    public Room(String idRoom, String capacity) {
        this.idRoom = idRoom;
        this.capacity = capacity;
    }

    public Room(String capacity) {
        this.capacity = capacity;
    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
