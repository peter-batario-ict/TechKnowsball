package quarter2.exampractical.LibraryKiosk;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class LibraryKioskTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        // Redirect System.out to capture output for assertions
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // Restore original System.out after test runs
        System.setOut(originalOut);
    }

    @Test
    public void testPayFines_insufficientPayment() {
        String input = String.join(System.lineSeparator(),
                "2",  // Pay Fines
                "10", // Amount paid (insufficient)
                "3"   // Exit
        );

        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));

        // Instantiate the actual system under test
        LibraryKioskMenu librarySystem = new LibraryKioskMenu();
        // librarySystem.start(scanner); // Call production method

        // Assert expected behavior in console output
        // assertTrue(outContent.toString().contains("Insufficient"));
    }

    @Test
    public void testPayFines_sufficientPayment() {
        String input = String.join(System.lineSeparator(),
                "2",  // Pay Fines
                "50", // Amount paid (sufficient)
                "3"   // Exit
        );

        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));

        LibraryKioskTest librarySystem = new LibraryKioskTest();
        // librarySystem.start(scanner);

        // assertTrue(outContent.toString().contains("Change:"));
    }
}