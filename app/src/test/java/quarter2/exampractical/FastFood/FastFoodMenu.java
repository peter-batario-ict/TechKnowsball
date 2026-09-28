package quarter2.exampractical.FastFood;

import java.util.Scanner;

public class FastFoodMenu {

    public void start(Scanner scanner) {
        boolean running = true;

        while (running) {
            printMainMenu();
            int choice = readChoice(scanner);

            switch (choice) {
                case 1:
                    orderBurger(scanner);
                    break;
                case 2:
                    orderFries();
                    break;
                case 3:
                    running = false;
                    break;
            }
        }
    }

    private void printMainMenu() {
        System.out.println("\n=== FAST FOOD MENU ===");
        System.out.println("1. Order Burger");
        System.out.println("2. Order Fries");
        System.out.println("3. Exit");
        System.out.print("Choose: ");
    }

    private void orderBurger(Scanner scanner) {
        System.out.println("\n-- Burger Options --");
        System.out.println("1. Combo (burger + fries + drink)");
        System.out.println("2. Solo (burger only)");
        System.out.print("Choose: ");

        int choice = readChoice(scanner);

        switch (choice) {
            case 1:
                System.out.println("Added: Burger Combo.");
                break;
            case 2:
                System.out.println("Added: Solo Burger.");
                break;
        }
    }

    private void orderFries() {
        System.out.println("Added: Fries.");
    }

    private int readChoice(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine().trim());
    }
}