import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class AppointmentUI {
    private AppointmentCalendar calendar;
    private Scanner scanner;

    public AppointmentUI(AppointmentCalendar calendar) {
        this.calendar = calendar;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        while (true) {
            clearScreen();
            System.out.println("1. Add Appointment");
            System.out.println("2. Remove Appointment");
            System.out.println("3. Print Appointments for a Day");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();  // consume newline

                switch (choice) {
                    case 1:
                        addAppointment();
                        break;
                    case 2:
                        removeAppointment();
                        break;
                    case 3:
                        printAppointmentsForDay();
                        break;
                    case 4:
                        System.out.println("Exiting program...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();  // consume the invalid input
            }

            System.out.println("Press Enter to continue...");
            scanner.nextLine();  // wait for user to press Enter
        }
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private void addAppointment() {
        System.out.print("Enter date (YYYY-MM-DD): ");
        LocalDate date = LocalDate.parse(scanner.nextLine());
        System.out.print("Enter start time (HH:MM): ");
        LocalTime startTime = LocalTime.parse(scanner.nextLine());
        System.out.print("Enter end time (HH:MM): ");
        LocalTime endTime = LocalTime.parse(scanner.nextLine());
        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        Appointment appointment = new Appointment(date, startTime, endTime, description);
        calendar.addAppointment(appointment);
        System.out.println("Appointment added.");
    }

    private void removeAppointment() {
        System.out.print("Enter date (YYYY-MM-DD) of the appointment to remove: ");
        LocalDate date = LocalDate.parse(scanner.nextLine());
        System.out.print("Enter start time (HH:MM) of the appointment to remove: ");
        LocalTime startTime = LocalTime.parse(scanner.nextLine());

        List<Appointment> appointments = calendar.getAppointmentsForDay(date);
        for (Appointment appointment : appointments) {
            if (appointment.getStartTime().equals(startTime)) {
                calendar.removeAppointment(appointment);
                System.out.println("Appointment removed.");
                return;
            }
        }
        System.out.println("Appointment not found.");
    }

    private void printAppointmentsForDay() {
        System.out.print("Enter date (YYYY-MM-DD): ");
        LocalDate date = LocalDate.parse(scanner.nextLine());
        List<Appointment> appointments = calendar.getAppointmentsForDay(date);
        if (appointments.isEmpty()) {
            System.out.println("No appointments found for this day.");
        } else {
            for (Appointment appointment : appointments) {
                System.out.println(appointment);
            }
        }
    }

    public static void main(String[] args) {
        AppointmentCalendar calendar = new AppointmentCalendar();
        AppointmentUI ui = new AppointmentUI(calendar);
        ui.displayMenu();
    }
}
