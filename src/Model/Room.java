package Model;

public class Room {
    public int idRoom;
    public int capacity;

    public Room(int idRoom, int capacity) {
        this.idRoom = idRoom;
        this.capacity = capacity;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
