package com.ejemplos.codesmells.service;

public class ManyCommentsService7 {

    // This Java file contains a simple class with excessive comments
    // Comments are used to describe every step of the code for clarity

    // The main method is the starting point of the program
    public static void main(String[] args) {
        // Declare an integer variable to store the user's age
        int age = 22; // User's age, initially set to 22

        // Declare a boolean variable to track if the user is a student
        boolean isStudent = true; // A flag indicating if the user is a student

        // Print the user's age and student status
        System.out.println("User's age: " + age + " and student status: " + isStudent); // Display user's age and student status
    }

    // Method to check if a person is eligible for a student discount
    public boolean isEligibleForStudentDiscount(int age, boolean isStudent) {
        // A person is eligible if they are under 25 years old and are a student
        if (age < 25 && isStudent) {
            return true; // Return true if eligible for discount
        } else {
            return false; // Return false if not eligible
        }
    }

    // Method to calculate the body mass index (BMI)
    public double calculateBMI(double weight, double height) {
        // BMI formula: weight (kg) / (height (m) * height (m))
        return weight / (height * height); // Return the calculated BMI
    }

    // Method to determine if a number is even or odd
    public String evenOrOdd(int number) {
        // If the number modulo 2 is 0, it is even, otherwise odd
        if (number % 2 == 0) {
            return "Even"; // Return "Even" if the number is divisible by 2
        } else {
            return "Odd"; // Return "Odd" if the number is not divisible by 2
        }
    }

    // Method to greet the user based on their name
    public void greetUser(String name) {
        // Output a personalized greeting message
        System.out.println("Hello, " + name + "! Welcome to the program!"); // Greet the user by name
    }
}
