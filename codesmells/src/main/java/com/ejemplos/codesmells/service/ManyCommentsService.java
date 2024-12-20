package com.ejemplos.codesmells.service;

public class ManyCommentsService {

    public static void main(String[] args) {
        int number = 10;

        number += 5; // Adding 5 to the number

        System.out.println("Result: " + number); // Output the final result

    }

    public int calculateSum(int a, int b) {
        return a + b; // Returning the sum
    }
}
