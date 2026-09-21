package MiniPeta3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

@RunWith(JUnit4.class)
public class MainMenuTest {

    @Test
    public void testMainMenuLoginAndReservation() {

        String input =
                "1\n" +
                        "user@gmail.com\n" +
                        "123456\n" +
                        "User\n" +
                        "Email\n" +

                        "2\n" +
                        "ReserveBites Restaurant\n" +
                        "September 25, 2026\n" +
                        "7:00 PM\n" +
                        "Peter\n" +

                        "3\n";

        ByteArrayInputStream inputStream =
                new ByteArrayInputStream(input.getBytes());

        Scanner scanner = new Scanner(inputStream);

        MainMenu mainMenu = new MainMenu();

        mainMenu.start(scanner);
    }
}