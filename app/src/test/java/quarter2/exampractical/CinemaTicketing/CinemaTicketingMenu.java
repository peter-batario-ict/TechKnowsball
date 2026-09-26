package quarter2.exampractical.CinemaTicketing;

import java.util.Scanner;

public class CinemaTicketingMenu {

    public void start(Scanner scanner) {

        boolean running = true;

        double ticketPrice = 0;
        double snackTotal = 0;
        double total;

        while (running) {

            System.out.println("\n==============================");
            System.out.println("       CINEMA TICKETING");
            System.out.println("==============================");
            System.out.println("1. Buy Ticket");
            System.out.println("2. Buy Snacks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 1) {

                System.out.print("Enter your age: ");
                int age = scanner.nextInt();
            }
        }
    }
}