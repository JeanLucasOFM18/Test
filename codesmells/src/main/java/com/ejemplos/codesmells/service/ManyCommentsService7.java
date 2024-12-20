package com.ejemplos.codesmells.service;

public class ManyCommentsService7 {

    public static void main(String[] args) {
        int age = 22; // User's age, initially set to 22

        boolean isStudent = true; // A flag indicating if the user is a student

        System.out.println("User's age: " + age + " and student status: " + isStudent); // Display user's age and student status
    }

    public boolean isEligibleForStudentDiscount(int age, boolean isStudent) {
        if (age < 25 && isStudent) {
            return true; // Return true if eligible for discount
        } else {
            return false; // Return false if not eligible
        }
    }

    public double calculateBMI(double weight, double height) {
        return weight / (height * height); // Return the calculated BMI
    }

    public String evenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even"; // Return "Even" if the number is divisible by 2
        } else {
            return "Odd"; // Return "Odd" if the number is not divisible by 2
        }
    }

    public void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to the program!"); // Greet the user by name
    }

}
