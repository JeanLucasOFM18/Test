package com.ejemplos.codesmells.service;

public class ManyCommentsService8 {

    // This Java file demonstrates simple arithmetic operations with comments explaining every step
    // The file aims to showcase how much explanation is added for every little operation

    // The main method is the entry point for the program
    public static void main(String[] args) {
        // Initialize two integer variables to perform arithmetic
        int num1 = 10; // First number, set to 10
        int num2 = 5; // Second number, set to 5

        // Perform addition of num1 and num2
        int sum = num1 + num2; // The sum of num1 and num2

        // Print the result of the addition
        System.out.println("Sum: " + sum); // Output the result of the sum

        // Perform subtraction of num1 from num2
        int difference = num1 - num2; // The difference between num1 and num2

        // Print the result of the subtraction
        System.out.println("Difference: " + difference); // Output the result of the difference

        // Perform multiplication of num1 and num2
        int product = num1 * num2; // The product of num1 and num2

        // Print the result of the multiplication
        System.out.println("Product: " + product); // Output the result of the product

        // Perform division of num1 by num2
        int quotient = num1 / num2; // The quotient of num1 divided by num2

        // Print the result of the division
        System.out.println("Quotient: " + quotient); // Output the result of the quotient

        // Perform modulo operation on num1 and num2
        int remainder = num1 % num2; // The remainder of num1 divided by num2

        // Print the result of the modulo operation
        System.out.println("Remainder: " + remainder); // Output the result of the remainder
    }

    // Method to calculate the square of a number
    public int square(int number) {
        // The square of a number is simply the number multiplied by itself
        return number * number; // Return the square of the number
    }

    // Method to calculate the cube of a number
    public int cube(int number) {
        // The cube of a number is the number multiplied by itself three times
        return number * number * number; // Return the cube of the number
    }

    // Method to check if a number is positive, negative, or zero
    public String checkSign(int number) {
        // If the number is greater than zero, it is positive
        if (number > 0) {
            return "Positive"; // Return "Positive" if the number is greater than zero
        }
        // If the number is less than zero, it is negative
        else if (number < 0) {
            return "Negative"; // Return "Negative" if the number is less than zero
        }
        // If the number is equal to zero
        else {
            return "Zero"; // Return "Zero" if the number is equal to zero
        }
    }
}
