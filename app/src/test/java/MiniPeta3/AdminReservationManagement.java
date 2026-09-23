package MiniPeta3;

import java.util.Scanner;

public class AdminReservationManagement {

    public void wait(Scanner scanner) {

        boolean isRunning = true;

        while (isRunning) {

            System.out.println("\n===== ADMIN RESERVATION MANAGEMENT =====");
            System.out.println("1. View Reservations");
            System.out.println("2. Approve Reservation");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Back to Main Menu");

            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    viewReservations();
                    break;

                case "2":
                    approveReservation(scanner);
                    break;

                case "3":
                    cancelReservation(scanner);
                    break;

                case "4":
                    System.out.println("Returning to Main Menu...");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void viewReservations() {

        System.out.println("\n===== RESERVATION LIST =====");

        System.out.println("Reservation 1");
        System.out.println("Customer: Juan Dela Cruz");
        System.out.println("Restaurant: Jollibee");
        System.out.println("Date: September 25, 2026");
        System.out.println("Time: 7:00 PM");
        System.out.println("Status: Pending");

        System.out.println("\nReservation 2");
        System.out.println("Customer: Maria Santos");
        System.out.println("Restaurant: Mang Inasal");
        System.out.println("Date: September 26, 2026");
        System.out.println("Time: 6:00 PM");
        System.out.println("Status: Approved");
    }

    private void approveReservation(Scanner scanner) {

        System.out.println("\n===== APPROVE RESERVATION =====");

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.println(
                "Reservation for " + customerName + " has been approved."
        );
    }

    private void cancelReservation(Scanner scanner) {

        System.out.println("\n===== CANCEL RESERVATION =====");

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.println(
                "Reservation for " + customerName + " has been cancelled."
        );
    }
}