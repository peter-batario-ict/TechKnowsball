package MiniPeta3;

import java.util.Scanner;

public class Login {

    public String execute(Scanner scanner) {

        System.out.println("===== RESERVEBITES LOGIN =====");

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        System.out.print("Enter Role (User/Admin): ");
        String role = scanner.nextLine();

        System.out.print("Enter Login Method (Email): ");
        String loginMethod = scanner.nextLine();

        // Check if all fields are filled
        if (email.isEmpty() || password.isEmpty()
                || role.isEmpty() || loginMethod.isEmpty()) {

            System.out.println("Please complete all fields.");
            return "Failed";
        }

        // Validate User login
        if (role.equalsIgnoreCase("User")
                && email.equals("user@gmail.com")
                && password.equals("123456")) {

            System.out.println("Login Successful!");
            System.out.println("Welcome, User!");
            return "User";
        }

        // Validate Admin login
        if (role.equalsIgnoreCase("Admin")
                && email.equals("admin@gmail.com")
                && password.equals("admin123")) {

            System.out.println("Login Successful!");
            System.out.println("Welcome, Admin!");
            return "Admin";
        }

        // Invalid login
        System.out.println("Login Failed. Try Again.");
        return "Failed";
    }
}