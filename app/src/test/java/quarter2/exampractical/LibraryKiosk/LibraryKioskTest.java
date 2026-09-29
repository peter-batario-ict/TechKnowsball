package quarter2.exampractical.LibraryKiosk;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class LibraryKioskTest {

    @Test
    public void testLibraryKioskFlow() {

        StringBuilder automatedInput = new StringBuilder();

        System.out.println("--- GENERATING LIBRARY KIOSK TEST DATA ---");

        // Step 1: Borrow Book
        automatedInput.append("1\n");

        // Step 2: Test insufficient fine payment
        automatedInput.append("2\n");
        automatedInput.append("10\n");

        // Step 3: Test sufficient fine payment
        automatedInput.append("2\n");
        automatedInput.append("50\n");

        // Step 4: Exit
        automatedInput.append("3\n");

        System.out.println("--- TEST DATA GENERATION COMPLETE ---\n");

        ByteArrayInputStream inputStream =
                new ByteArrayInputStream(
                        automatedInput.toString().getBytes()
                );

        Scanner scanner = new Scanner(inputStream);

        LibraryKioskMenu librarySystem = new LibraryKioskMenu();
        librarySystem.start(scanner);
    }
}
