package Model;

public class Room {
    public String room;
    public int capacity;

    public Room (String room, int capacity) {
        this.room = room;
        this.capacity = capacity;
    }

    public String getRoom() {
        return room;
    }
    public void setRoom(String room) {
        this.room = room;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
