import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    private LocalDate date; // Appointment Date
    private LocalTime startTime; // Appointment Start Time
    private LocalTime endTime; // Appointment End Time
    private String description; // Appointment Description

    public Appointment(LocalDate date, LocalTime startTime, LocalTime endTime, String description) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description + " " + date + " " + startTime + " " + endTime;
    }
}
