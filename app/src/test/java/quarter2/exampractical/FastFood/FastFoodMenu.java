package quarter2.exampractical.FastFood;

import java.util.Scanner;

public class FastFoodMenu {

    private static final double BURGER_PRICE = 99.00;
    private static final double COMBO_UPGRADE_PRICE = 45.00;
    private static final double FRIES_PRICE = 39.00;

    private int soloCount;
    private int comboCount;
    private int friesCount;
    private double total;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new FastFoodMenu().start(scanner);
        scanner.close();
    }

    public void start(Scanner scanner) {
        resetOrder();
        boolean running = true;

        while (running && scanner.hasNextLine()) {
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
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }

        printReceipt();

    }

    private void printMainMenu() {
        System.out.println("\n=== FAST FOOD MENU ===");
        System.out.println("1. Order Burger  (" + format(BURGER_PRICE) + ")");
        System.out.println("2. Order Fries   (" + format(FRIES_PRICE) + ")");
        System.out.println("3. Exit");
        System.out.print("Choose: ");
    }

    private void orderBurger(Scanner scanner) {
        System.out.println("\n-- Burger Options --");
        System.out.println("1. Combo (burger + fries + drink) - "
                + format(BURGER_PRICE + COMBO_UPGRADE_PRICE));
        System.out.println("2. Solo (burger only) - " + format(BURGER_PRICE));
        System.out.print("Choose: ");

        int choice = readChoice(scanner);

        switch (choice) {
            case 1:
                comboCount++;
                total += BURGER_PRICE + COMBO_UPGRADE_PRICE;
                System.out.println("Added: Burger Combo.");
                break;
            case 2:
                soloCount++;
                total += BURGER_PRICE;
                System.out.println("Added: Solo Burger.");
                break;
            default:
                System.out.println("Invalid burger option. Returning to main menu.");
        }
    }

    private void orderFries() {
        friesCount++;
        total += FRIES_PRICE;
        System.out.println("Added: Fries.");
    }

    private void printReceipt() {
        System.out.println("\n=== RECEIPT ===");
        System.out.println("Burger Combo x" + comboCount + " = "
                + format(comboCount * (BURGER_PRICE + COMBO_UPGRADE_PRICE)));
        System.out.println("Solo Burger  x" + soloCount + " = "
                + format(soloCount * BURGER_PRICE));
        System.out.println("Fries        x" + friesCount + " = "
                + format(friesCount * FRIES_PRICE));
        System.out.println("TOTAL: " + format(total));
        System.out.println("Thank you! Goodbye.");
    }

    private int readChoice(Scanner scanner) {
        if (!scanner.hasNextLine()) {
            return -1;
        }
        String line = scanner.nextLine().trim();
        try {
            return Integer.parseInt(line);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void resetOrder() {
        soloCount = 0;
        comboCount = 0;
        friesCount = 0;
        total = 0.0;
    }

    private String format(double amount) {
        return String.format("%.2f", amount);
    }
}