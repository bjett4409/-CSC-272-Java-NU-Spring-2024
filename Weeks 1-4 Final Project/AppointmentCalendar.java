// AppointmentCalendar.java
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AppointmentCalendar {
    private List<Appointment> appointments;

    public AppointmentCalendar() {
        this.appointments = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void removeAppointment(Appointment appointment) {
        appointments.remove(appointment);
    }

    public List<Appointment> getAppointmentsForDay(LocalDate date) {
        List<Appointment> result = new ArrayList<>();
        for (Appointment appointment : appointments) {
            if (appointment.getDate().equals(date)) {
                result.add(appointment);
            }
        }
        return result;
    }
}
