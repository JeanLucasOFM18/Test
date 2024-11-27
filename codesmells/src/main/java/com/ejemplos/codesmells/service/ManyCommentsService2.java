package com.ejemplos.codesmells.service;

public class ManyCommentsService2 {

    // This file demonstrates another example of "Many Comments"
    // The goal is to have more than 30% of comments in this file

    // This is the entry point of the program
    public static void main(String[] args) {
        // Variable initialization
        int x = 5; // The initial value is set to 5

        // Perform a multiplication
        x = x * 2; // Multiply by 2

        // Output the result of the multiplication
        System.out.println("The value of x after multiplication: " + x);
    }

    // This method checks if a number is even
    public boolean isEven(int num) {
        // Check if the number is divisible by 2
        if (num % 2 == 0) {
            return true; // Return true if even
        } else {
            return false; // Return false if odd
        }
    }

    // A simple method that returns a greeting message
    public String getGreeting() {
        // Returning a fixed greeting message
        return "Hello, World!";
    }
}
