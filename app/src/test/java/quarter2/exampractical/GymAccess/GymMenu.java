package quarter2.exampractical.GymAccess;

import java.util.Scanner;

public class GymMenu {

    public void start(Scanner scanner) {

        // Controls whether the main menu continues running
        boolean running = true;

        // Display the main gym access menu
        System.out.println("==========================================");
        System.out.println("          🏋️  GYM ACCESS SYSTEM");
        System.out.println("==========================================");
        System.out.println("      Does the user want to enter?");
        System.out.println("------------------------------------------");
        System.out.println("  1. YES");
        System.out.println("  2. NO");
        System.out.println("  3. EXIT");
        System.out.println("==========================================");

        // Continue displaying/processing input while the program is running
        while (running && scanner.hasNextLine()) {

            System.out.print("\nEnter your choice: ");
            String input = scanner.nextLine().trim();

            switch (input) {

                // User chooses to enter the gym
                case "1":
                    System.out.println("\n==========================================");
                    System.out.println("       ✓ GYM ACCESS GRANTED!");
                    System.out.println("==========================================");
                    System.out.println("User has successfully entered the gym.");
                    System.out.println("==========================================\n");
                    break;

                // User does not want to enter the gym
                case "2":

                    System.out.println("\n==========================================");
                    System.out.println("          TRAINER SERVICES");
                    System.out.println("==========================================");
                    System.out.println("Does the user want to hire a trainer?");
                    System.out.println("------------------------------------------");
                    System.out.println("  1. YES");
                    System.out.println("  2. NO");
                    System.out.println("==========================================");

                    // Make sure there is another line of input
                    if (scanner.hasNextLine()) {

                        System.out.print("\nEnter your choice: ");
                        String tierInput = scanner.nextLine().trim();

                        // User chooses YES
                        if (tierInput.equals("1")) {

                            System.out.println("\n==========================================");
                            System.out.println("             USER PROFILE");
                            System.out.println("==========================================");
                            System.out.println("NAME       : #########");
                            System.out.println("EMAIL      : ###########");
                            System.out.println("MEMBERSHIP : REGULAR");
                            System.out.println("------------------------------------------");
                            System.out.println("TRAINER UNAVAILABLE!");
                            System.out.println("Please upgrade your membership");
                            System.out.println("to access trainer services.");
                            System.out.println("==========================================");
                            System.out.println("              3. EXIT");
                            System.out.println("==========================================\n");

                        }

                        // User chooses NO
                        else if (tierInput.equals("2")) {

                            System.out.println("\n==========================================");
                            System.out.println("             USER PROFILE");
                            System.out.println("==========================================");
                            System.out.println("NAME       : #########");
                            System.out.println("EMAIL      : ###########");
                            System.out.println("MEMBERSHIP : REGULAR");
                            System.out.println("------------------------------------------");
                            System.out.println("✓ TRAINER HIRED SUCCESSFULLY!");
                            System.out.println("==========================================");
                            System.out.println("              3. EXIT");
                            System.out.println("==========================================\n");

                        }

                        // Invalid trainer menu choice
                        else {
                            System.out.println("\n------------------------------------------");
                            System.out.println(" Invalid choice. Please select 1 or 2.");
                            System.out.println("------------------------------------------\n");
                        }
                    }

                    break;

                // User chooses to exit
                case "3":
                    System.out.println("\n==========================================");
                    System.out.println("             EXITING GYM");
                    System.out.println("==========================================");
                    System.out.println("User has successfully exited the gym!");
                    System.out.println("Thank you for using the Gym Access System.");
                    System.out.println("==========================================\n");

                    // Stop the while loop
                    running = false;
                    break;

                // Handles invalid input
                default:
                    System.out.println("\n------------------------------------------");
                    System.out.println(" Invalid choice!");
                    System.out.println(" Please select 1, 2, or 3.");
                    System.out.println("------------------------------------------");
                    break;
            }
        }
    }
}
