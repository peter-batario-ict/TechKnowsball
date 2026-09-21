package MiniPeta3;

import java.util.Scanner;

public class MainMenu {

    public void start(Scanner scanner) {

        Login login = new Login();
        Reservation reservation = new Reservation();

        boolean isRunning = true;

        System.out.println("================================");
        System.out.println("       WELCOME TO RESERVEBITES");
        System.out.println("================================");

        while (isRunning) {

            System.out.println("\n===== RESERVEBITES MAIN MENU =====");
            System.out.println("1. Login");
            System.out.println("2. Make Reservation");
            System.out.println("3. Exit");

            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    login.execute(scanner);
                    break;

                case "2":
                    reservation.execute(scanner);
                    break;

                case "3":
                    System.out.println("Thank you for using ReserveBites!");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}