package quarter2.exampractical.LibraryKiosk;

import java.util.Scanner;

public class LibraryKioskMenu {

    public void start(Scanner scanner) {
        boolean running = true;

        // Continue displaying the menu until the user chooses to exit.
        while (running) {
            System.out.println("=== LIBRARY KIOSK MENU ===");
            System.out.println("1. Borrow Book");
            System.out.println("2. Pay Fines");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Borrow Book selected.");

            } else if (choice == 2) {
                System.out.println("Enter payment:");
                int payment = scanner.nextInt();

                // Check if the payment is enough to cover the 15 fine.
                if (payment < 15) {
                    System.out.println("Insufficient Payment");
                } else {
                    int change = payment - 15;
                    System.out.println("Change: " + change);
                }

            } else if (choice == 3) {
                System.out.println("Exiting Library Kiosk.");
                running = false;

            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}

