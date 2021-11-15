package Model;

public class TimeSlot {
    public String idTimeSlot;
    public String dateTimeSlot;
    public String startTimeSlot;
    public String endTimeSlot;

    public TimeSlot(String idTimeSlot, String dateTimeSlot, String startTimeSlot, String endTimeSlot) {
        this.idTimeSlot = idTimeSlot;
        this.dateTimeSlot = dateTimeSlot;
        this.startTimeSlot = startTimeSlot;
        this.endTimeSlot = endTimeSlot;
    }

    public TimeSlot(String dateTimeSlot, String startTimeSlot, String endTimeSlot) {
        this.dateTimeSlot = dateTimeSlot;
        this.startTimeSlot = startTimeSlot;
        this.endTimeSlot = endTimeSlot;
    }

    public TimeSlot(String idTimeSlot) {
        this.idTimeSlot = idTimeSlot;
    }

    public String getIdTimeSlot() {
        return idTimeSlot;
    }

    public void setIdTimeSlot(String idTimeSlot) {
        this.idTimeSlot = idTimeSlot;
    }

    public String getDateTimeSlot() {
        return dateTimeSlot;
    }

    public void setDateTimeSlot(String dateTimeSlot) {
        this.dateTimeSlot = dateTimeSlot;
    }

    public String getStartTimeSlot() {
        return startTimeSlot;
    }

    public void setStartTimeSlot(String startTimeSlot) {
        this.startTimeSlot = startTimeSlot;
    }

    public String getEndTimeSlot() {
        return endTimeSlot;
    }

    public void setEndTimeSlot(String endTimeSlot) {
        this.endTimeSlot = endTimeSlot;
    }
}
