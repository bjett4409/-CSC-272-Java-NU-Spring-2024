public void displayMenu() {
    while (true) {
        System.out.println("1. Add Appointment");
        System.out.println("2. Remove Appointment");
        System.out.println("3. Print Appointments for a Day");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
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
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}