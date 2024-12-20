package com.ejemplos.codesmells.service;

public class ManyCommentsService5 {

    public static void main(String[] args) {
        int age = 25; // Age of the user

        String name = "Alice"; // The user's name

        System.out.println("Name: " + name + ", Age: " + age); // Concatenate name and age and print it
    }

    public boolean isEligibleToVote(int age) {
        if (age >= 18) {
            return true; // Eligible to vote
        } else {
            return false; // Not eligible to vote
        }
    }

    public int calculatePerimeter(int length, int width) {
        return 2 * (length + width); // Return the calculated perimeter
    }

    public void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome!"); // Greet the user by name
    }

    public int calculateArea(int length, int width) {
        return length * width; // Return the calculated area
    }

}
