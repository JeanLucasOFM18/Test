package com.ejemplos.codesmells.service;

public class ManyCommentsService10 {

    // This file demonstrates basic mathematical operations
    // It performs addition, subtraction, multiplication, and division on two numbers
    // Each operation is explained in detail with comments

    // Main method to execute the operations
    public static void main(String[] args) {
        // Initialize two numbers for mathematical operations
        int num1 = 10; // First number for operations
        int num2 = 5;  // Second number for operations

        // Addition operation
        int sum = num1 + num2; // Adding num1 and num2

        // Print the result of addition
        System.out.println("Sum: " + sum); // Output the sum

        // Subtraction operation
        int difference = num1 - num2; // Subtract num2 from num1

        // Print the result of subtraction
        System.out.println("Difference: " + difference); // Output the difference

        // Multiplication operation
        int product = num1 * num2; // Multiply num1 by num2

        // Print the result of multiplication
        System.out.println("Product: " + product); // Output the product

        // Division operation
        double quotient = (double) num1 / num2; // Divide num1 by num2, cast to double

        // Print the result of division
        System.out.println("Quotient: " + quotient); // Output the quotient

        // Modulus operation
        int remainder = num1 % num2; // Get the remainder when num1 is divided by num2

        // Print the result of modulus
        System.out.println("Remainder: " + remainder); // Output the remainder

        // Square root operation
        double sqrt = Math.sqrt(num1); // Find the square root of num1

        // Print the result of square root
        System.out.println("Square root of num1: " + sqrt); // Output the square root of num1

        // Check if num1 is divisible by num2
        boolean divisible = num1 % num2 == 0; // Check if num1 is divisible by num2

        // Print whether num1 is divisible by num2
        System.out.println("Is num1 divisible by num2? " + divisible); // Output the result of divisibility check

        // Exponentiation operation (num1 raised to the power of num2)
        double power = Math.pow(num1, num2); // num1 raised to the power of num2

        // Print the result of exponentiation
        System.out.println("num1 raised to the power of num2: " + power); // Output the result of exponentiation

        // Absolute value operation
        int absValue = Math.abs(-num1); // Get the absolute value of -num1

        // Print the absolute value result
        System.out.println("Absolute value of -num1: " + absValue); // Output the absolute value
    }

}
