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
        }
    }
}
