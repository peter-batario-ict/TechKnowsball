package MiniPeta3;

import java.util.Scanner;

public class Reservation {

    public String execute(Scanner scanner) {

        System.out.println("===== RESERVATION =====");

        System.out.print("Enter Restaurant Name: ");
        String restaurantName = scanner.nextLine();

        System.out.print("Enter Reservation Date: ");
        String reservationDate = scanner.nextLine();

        System.out.print("Enter Reservation Time: ");
        String reservationTime = scanner.nextLine();

        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();

        if (restaurantName.isEmpty() ||
                reservationDate.isEmpty() ||
                reservationTime.isEmpty() ||
                customerName.isEmpty()) {

            System.out.println("Please complete all fields.");
            return "Failed";
        }

        System.out.println("Reservation Successful!");
        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Date: " + reservationDate);
        System.out.println("Time: " + reservationTime);
        System.out.println("Customer: " + customerName);

        return "Successful";
    }
}