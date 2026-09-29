package quarter2.exampractical.LibraryKiosk;

import java.util.Scanner;

public class LibraryKioskMenu {

    public void start(Scanner scanner) {
        boolean running = true;

        while (running) {
            System.out.println("=== LIBRARY KIOSK MENU ===");
            System.out.println("1. Borrow Book");
            System.out.println("2. Pay Fines");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Borrow Book selected.");

            } else if (choice == 2) {
                System.out.println("Pay Fines selected.");

            } else if (choice == 3) {
                running = false;

            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
