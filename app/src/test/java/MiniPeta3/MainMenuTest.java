package MiniPeta3;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class MainMenuTest {

    @Test
    public void testReserveBitesSystem() {

        StringBuilder simulatedUserInput = new StringBuilder();

        // 1. Login
        simulatedUserInput.append("1\n");

        // Login information
        simulatedUserInput.append("user@gmail.com\n");
        simulatedUserInput.append("123456\n");
        simulatedUserInput.append("User\n");
        simulatedUserInput.append("Email\n");

        // 2. Restaurant Search
        simulatedUserInput.append("2\n");

        // 3. Make Reservation
        simulatedUserInput.append("3\n");

        // 4. Admin Reservation Management
        simulatedUserInput.append("4\n");

        // 5. Exit
        simulatedUserInput.append("5\n");

        // Convert simulated input into a Scanner
        ByteArrayInputStream inputStream =
                new ByteArrayInputStream(
                        simulatedUserInput.toString().getBytes()
                );

        Scanner scanner = new Scanner(inputStream);

        // Run the actual ReserveBites MainMenu
        MainMenu mainMenu = new MainMenu();

        mainMenu.start(scanner);
    }
}