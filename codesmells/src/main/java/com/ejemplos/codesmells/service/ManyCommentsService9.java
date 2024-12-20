package com.ejemplos.codesmells.service;

public class ManyCommentsService9 {

    // This file demonstrates basic string manipulations in Java
    // Comments will be used to explain every operation performed on the string

    // The main method to start execution
    public static void main(String[] args) {
        // Declare a string variable to hold a message
        String message = "Hello, World!"; // Message to be manipulated

        // Print the original message
        System.out.println("Original message: " + message); // Output the original message

        // Convert the string to uppercase
        String upperMessage = message.toUpperCase(); // Convert the message to uppercase

        // Print the uppercase message
        System.out.println("Uppercase message: " + upperMessage); // Output the uppercase message

        // Convert the string to lowercase
        String lowerMessage = message.toLowerCase(); // Convert the message to lowercase

        // Print the lowercase message
        System.out.println("Lowercase message: " + lowerMessage); // Output the lowercase message

        // Check if the message contains the word "Hello"
        boolean containsHello = message.contains("Hello"); // Check if the message contains "Hello"

        // Print whether the message contains "Hello"
        System.out.println("Contains 'Hello': " + containsHello); // Output the result of the contains check

        // Find the position of the word "World" in the message
        int indexOfWorld = message.indexOf("World"); // Find the index of "World" in the message

        // Print the position of the word "World"
        System.out.println("Position of 'World': " + indexOfWorld); // Output the position of "World"

        // Replace the word "World" with "Java"
        String newMessage = message.replace("World", "Java"); // Replace "World" with "Java"

        // Print the new message after replacement
        System.out.println("New message: " + newMessage); // Output the new message

        // Check if the message starts with "Hello"
        boolean startsWithHello = message.startsWith("Hello"); // Check if the message starts with "Hello"

        // Print whether the message starts with "Hello"
        System.out.println("Starts with 'Hello': " + startsWithHello); // Output the result of the startsWith check

        // Check if the message ends with "!"
        boolean endsWithExclamation = message.endsWith("!"); // Check if the message ends with "!"

        // Print whether the message ends with "!"
        System.out.println("Ends with '!': " + endsWithExclamation); // Output the result of the endsWith check
    }

    // Method to reverse the string
    public String reverseString(String input) {
        // Create a new StringBuilder to reverse the string
        StringBuilder reversed = new StringBuilder(input); // Initialize the StringBuilder with the input string

        // Reverse the string and return it
        return reversed.reverse().toString(); // Return the reversed string
    }

    // Method to check if a string is empty
    public boolean isEmpty(String input) {
        // Check if the input string is empty
        return input.isEmpty(); // Return true if the string is empty, false otherwise
    }

    // Method to trim whitespace from a string
    public String trimString(String input) {
        // Trim leading and trailing whitespace from the string
        return input.trim(); // Return the trimmed string
    }
}
