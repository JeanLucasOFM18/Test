package com.ejemplos.codesmells.service;

public class ManyCommentsService {

    // This is a comment explaining the following class
    // This class will demonstrate the "Many Comments" code smell
    // The purpose of this file is to have a significant amount of comments

    // This is the main method where the program starts
    public static void main(String[] args) {
        // Initializing a variable
        int number = 10;

        // Performing an operation on the variable
        number += 5; // Adding 5 to the number

        // Displaying the result
        System.out.println("Result: " + number); // Output the final result

        // Another comment explaining the end of the method
    }

    // Method to calculate sum
    public int calculateSum(int a, int b) {
        // This method will sum two integers
        return a + b; // Returning the sum
    }
}
