package com.ejemplos.codesmells.service;

public class ManyCommentsService9 {

    public static void main(String[] args) {
        String message = "Hello, World!"; // Message to be manipulated

        System.out.println("Original message: " + message); // Output the original message

        String upperMessage = message.toUpperCase(); // Convert the message to uppercase

        System.out.println("Uppercase message: " + upperMessage); // Output the uppercase message

        String lowerMessage = message.toLowerCase(); // Convert the message to lowercase

        System.out.println("Lowercase message: " + lowerMessage); // Output the lowercase message

        boolean containsHello = message.contains("Hello"); // Check if the message contains "Hello"

        System.out.println("Contains 'Hello': " + containsHello); // Output the result of the contains check

        int indexOfWorld = message.indexOf("World"); // Find the index of "World" in the message

        System.out.println("Position of 'World': " + indexOfWorld); // Output the position of "World"

        String newMessage = message.replace("World", "Java"); // Replace "World" with "Java"

        System.out.println("New message: " + newMessage); // Output the new message

        boolean startsWithHello = message.startsWith("Hello"); // Check if the message starts with "Hello"

        System.out.println("Starts with 'Hello': " + startsWithHello); // Output the result of the startsWith check

        boolean endsWithExclamation = message.endsWith("!"); // Check if the message ends with "!"

        System.out.println("Ends with '!': " + endsWithExclamation); // Output the result of the endsWith check
    }

    public String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input); // Initialize the StringBuilder with the input string

        return reversed.reverse().toString(); // Return the reversed string
    }

    public boolean isEmpty(String input) {
        return input.isEmpty(); // Return true if the string is empty, false otherwise
    }

    public String trimString(String input) {
        return input.trim(); // Return the trimmed string
    }
}
