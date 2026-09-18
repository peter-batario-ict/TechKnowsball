package MiniPeta3;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class LoginTest {

    @Test
    public void testLogin() {

        String input =
                "user@gmail.com\n" +
                        "123456\n" +
                        "User\n" +
                        "Email\n";

        ByteArrayInputStream inputStream =
                new ByteArrayInputStream(input.getBytes());

        Scanner scanner = new Scanner(inputStream);

        Login login = new Login();

        String result = login.execute(scanner);

        assertEquals("User", result);
    }
}