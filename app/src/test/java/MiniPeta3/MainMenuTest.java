package MiniPeta3;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class MainMenuTest {

    @Test
    public void testMainMenuLogin() {

        // Simulated user input
        String input =
                "1\n" +                  // Main Menu → Login
                        "user@gmail.com\n" +      // Email
                        "123456\n" +              // Password
                        "User\n" +                // Role
                        "Email\n" +               // Login Method
                        "5\n";                   // Main Menu → Exit

        // Convert input into a virtual keyboard
        ByteArrayInputStream inputStream =
                new ByteArrayInputStream(input.getBytes());

        Scanner scanner = new Scanner(inputStream);

        // Start Main Menu
        MainMenu mainMenu = new MainMenu();

        mainMenu.start(scanner);
    }
}