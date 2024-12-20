package com.ejemplos.codesmells.service;

public class ManyCommentsService4 {

    // This file illustrates a code example with "Many Comments".
    // The purpose is to demonstrate how excessive comments can clutter the code

    // Main method starts here
    public static void main(String[] args) {
        // Declaring a string variable to store a name
        String name = "John"; // The name of the person

        // Concatenating the string with another message
        String greeting = "Hello, " + name + "!"; // Create a greeting message

        // Outputting the greeting to the console
        System.out.println(greeting); // Print the greeting
    }

    // Method to check if a person is eligible for a senior discount
    public boolean isEligibleForSeniorDiscount(int age) {
        // If age is 65 or greater, the person is eligible
        if (age >= 65) {
            return true; // Eligible for discount
        } else {
            return false; // Not eligible for discount
        }
    }

    // Method to calculate the square of a number
    public int calculateSquare(int number) {
        // Multiply the number by itself
        return number * number; // Return the square of the number
    }

    // Method to print a goodbye message
    public void printGoodbye() {
        // Print a simple goodbye message
        System.out.println("Goodbye! See you next time."); // Output goodbye message
    }

    // A simple method that returns a greeting message1
    // A simple method that returns a greeting message2
    // A simple method that returns a greeting message3
    // A simple method that returns a greeting message4
    // A simple method that returns a greeting message5
    // A simple method that returns a greeting message6
    // A simple method that returns a greeting message7
    // A simple method that returns a greeting message8
    // A simple method that returns a greeting message9
    // A simple method that returns a greeting message0
}
