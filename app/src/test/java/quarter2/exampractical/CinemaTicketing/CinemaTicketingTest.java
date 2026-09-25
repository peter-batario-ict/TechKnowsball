package com.example.quarter2.practicalexam;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class CinemaTicketingTest {

    @Test
    public void testCinemaFlow() {

        StringBuilder automatedInput = new StringBuilder();

        System.out.println("--- GENERATING CINEMA TEST DATA ---");

        // Test 1: Buy Ticket - Underage
        automatedInput.append("1\n");
        automatedInput.append("15\n");

        // Test 2: Buy Ticket - Legal Age
        automatedInput.append("1\n");
        automatedInput.append("20\n");

        // Test 3: Buy Snacks
        automatedInput.append("2\n");

        // Test 4: Invalid Menu Choice
        automatedInput.append("5\n");

        // Test 5: Exit System
        automatedInput.append("3\n");

        System.out.println("--- TEST DATA GENERATION COMPLETE ---\n");

        ByteArrayInputStream inputStream =
                new ByteArrayInputStream(
                        automatedInput.toString().getBytes()
                );

        Scanner scanner = new Scanner(inputStream);

        CinemaMenu cinemaSystem = new CinemaMenu();
        cinemaSystem.start(scanner);
    }
}
