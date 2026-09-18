package MiniPeta3;

import java.util.Scanner;

public class MainMenu {

    public void start(Scanner scanner) {

        Login login = new Login();
        RestaurantSearch restaurantSearch = new RestaurantSearch();
        Reservation reservation = new Reservation();
        AdminReservationManagement adminReservationManagement =
                new AdminReservationManagement();

        boolean isRunning = true;

        System.out.println("================================");
        System.out.println("       WELCOME TO RESERVEBITES");
        System.out.println("================================");

        while (isRunning) {

            System.out.println("\n===== RESERVEBITES MAIN MENU =====");
            System.out.println("1. Login");
            System.out.println("2. Restaurant Search");
            System.out.println("3. Make Reservation");
            System.out.println("4. Admin Reservation Management");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    login.wait(scanner);
                    break;

                case "2":
                    restaurantSearch.wait(scanner);
                    break;

                case "3":
                    reservation.wait(scanner);
                    break;

                case "4":
                    adminReservationManagement.wait(scanner);
                    break;

                case "5":
                    System.out.println("Thank you for using ReserveBites!");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}