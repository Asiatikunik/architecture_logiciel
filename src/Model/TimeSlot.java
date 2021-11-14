package Model;

public class TimeSlot {
    public int id;
    public String date;
    public String start;
    public String end;

    public TimeSlot(int id, String date, String start, String end) {
        this.id = id;
        this.date = date;
        this.start = start;
        this.end = end;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
