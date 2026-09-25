package quarter2.exampractical;

import java.util.Scanner;

public class CinemaMenu {

    public void start(Scanner scanner) {

        boolean running = true;

        while (running) {

            System.out.println("\n=== CINEMA MENU ===");
            System.out.println("1. Buy Ticket");
            System.out.println("2. Buy Snacks");
            System.out.println("3. Exit System");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter your age: ");
                    int age = scanner.nextInt();

                    if (age < 18) {
                        System.out.println("Access Denied");
                    } else {
                        System.out.println("Ticket Printed");
                    }
                    break;

                case 2:
                    System.out.println("Snack purchase selected.");
                    System.out.println("Snacks purchased successfully!");
                    break;

                case 3:
                    System.out.println("Exiting System...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
