package com.ejemplos.codesmells.service;

public class ManyCommentsService3 {

    // This file contains an example of "Many Comments" code smell
    // It has detailed comments explaining each section of the code

    // Main method where the program starts
    public static void main(String[] args) {
        // Defining an integer variable and initializing it
        int number = 20; // Initializing with 20

        // Adding a value to the number
        number += 10; // Adding 10 to the existing value

        // Printing the result to the console
        System.out.println("Updated number: " + number); // This will print the updated value of 'number'
    }

    // Method to subtract two numbers
    public int subtract(int a, int b) {
        // This method returns the difference between two numbers
        return a - b; // Return the result of the subtraction
    }

    // Method to multiply two numbers
    public int multiply(int a, int b) {
        // This method multiplies two numbers and returns the result
        return a * b; // Return the multiplication result
    }

    // Method to divide two numbers
    public double divide(int a, int b) {
        // Division operation
        // Ensure b is not zero to avoid division by zero error
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero"); // Throw exception if division by zero
        }
        return (double) a / b; // Return the division result as a double
    }
}
