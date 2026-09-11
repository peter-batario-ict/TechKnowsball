package com.example.myapplicationtechknowsball.quarter2;

import org.junit.Test;

public class NarvajaFunction {

    @Test
    public void printMyProfile() {

        // Personal details
        String myName = "Prince";
        String petName = "Popoy";
        String favFood = "Sinigang";
        int myAge = 16;

        // Display profile
        System.out.println("===== MY DIGITAL PROFILE =====");

        System.out.println(
                "Hello, my name is " + myName +
                        " and I am " + myAge + " years old."
        );

        System.out.println(
                "I have a wonderful pet named " + petName + "."
        );

        System.out.println(
                "If I could, I would eat " + favFood +
                        " every single day!"
        );
    }
}