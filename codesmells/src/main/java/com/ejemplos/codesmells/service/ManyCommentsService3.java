package com.ejemplos.codesmells.service;

public class ManyCommentsService3 {

    public static void main(String[] args) {
        int number = 20; // Initializing with 20

        number += 10; // Adding 10 to the existing value

        System.out.println("Updated number: " + number); // This will print the updated value of 'number'
    }

    public int subtract(int a, int b) {
        return a - b; // Return the result of the subtraction
    }

    public int multiply(int a, int b) {
        return a * b; // Return the multiplication result
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero"); // Throw exception if division by zero
        }
        return (double) a / b; // Return the division result as a double
    }
}
