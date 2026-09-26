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
                if (age < 18) {

                    System.out.println("Access Denied.");
                    System.out.println("You must be 18 or older.");

                } else {

                    ticketPrice = 250;

                    System.out.println("Ticket Printed!");
                    System.out.println("Ticket Price: ₱" + ticketPrice);
                    System.out.println("Enjoy the movie!");
                }

            } else if (choice == 2) {

                System.out.println("\n--- SNACK MENU ---");
                System.out.println("Popcorn - ₱100");
                System.out.println("Soda - ₱60");
                System.out.println("Nachos - ₱80");

                System.out.println("Snacks are available at the counter.");

            } else if (choice == 3) {

                total = ticketPrice + snackTotal;

                System.out.println("\n==============================");
                System.out.println("           RECEIPT");
                System.out.println("==============================");
                System.out.println("Ticket: ₱" + ticketPrice);
                System.out.println("Snacks: ₱" + snackTotal);
                System.out.println("------------------------------");
                System.out.println("TOTAL: ₱" + total);
                System.out.println("==============================");
                System.out.println("Thank you for using the Cinema Ticketing System!");

            }
        }
    }
}