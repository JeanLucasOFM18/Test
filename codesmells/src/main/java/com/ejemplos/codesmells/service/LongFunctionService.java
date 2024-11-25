package com.ejemplos.codesmells.service;

import org.springframework.stereotype.Service;

@Service
public class LongFunctionService {

    public void function1() {
        int a = 1, b = 2, c = 3, d = 4, e = 5;
        int sum = 0;
        System.out.println("Starting calculation...");
        sum += a + b;
        System.out.println("Step 1: Added a and b. Sum: " + sum);
        sum += c;
        System.out.println("Step 2: Added c. Sum: " + sum);
        sum += d;
        System.out.println("Step 3: Added d. Sum: " + sum);
        sum += e;
        System.out.println("Step 4: Added e. Sum: " + sum);
        int product = a * b;
        System.out.println("Step 5: Multiplied a and b. Product: " + product);
        product *= c;
        System.out.println("Step 6: Multiplied by c. Product: " + product);
        product *= d;
        System.out.println("Step 7: Multiplied by d. Product: " + product);
        product *= e;
        System.out.println("Step 8: Multiplied by e. Product: " + product);
        System.out.println("Calculation complete. Sum: " + sum + ", Product: " + product);
    }

    public void function2() {
        String message = "Processing string:";
        System.out.println(message);
        for (int i = 1; i <= 5; i++) {
            message += " Step" + i;
            System.out.println("Added Step " + i + " to message.");
        }
        System.out.println("String after steps: " + message);
        for (int i = 1; i <= 3; i++) {
            message += " Final" + i;
            System.out.println("Added Final " + i + " to message.");
        }
        System.out.println("String after finals: " + message);
        String finalMessage = message + " - Completed!";
        System.out.println("Final message: " + finalMessage);
    }

    public void function3() {
        int[] values = new int[10];
        System.out.println("Initializing array...");
        for (int i = 0; i < values.length; i++) {
            values[i] = i * 2;
            System.out.println("Set position " + i + " to " + values[i]);
        }
        System.out.println("Array initialized.");
        int total = 0;
        for (int value : values) {
            total += value;
            System.out.println("Added " + value + " to total. Total now: " + total);
        }
        System.out.println("Total sum of array: " + total);
        for (int value : values) {
            if (value % 4 == 0) {
                System.out.println(value + " is a multiple of 4.");
            } else {
                System.out.println(value + " is not a multiple of 4.");
            }
        }
        System.out.println("Array processing complete.");
    }

    public void function4() {
        int counter = 0;
        System.out.println("Starting counter...");
        while (counter < 20) {
            counter++;
            if (counter % 3 == 0) {
                System.out.println(counter + " is divisible by 3.");
            } else {
                System.out.println(counter + " is not divisible by 3.");
            }
        }
        System.out.println("Counter loop complete.");
        System.out.println("Checking counter value...");
        if (counter > 15) {
            System.out.println("Counter is greater than 15.");
        } else {
            System.out.println("Counter is 15 or less.");
        }
        counter = 0;
        System.out.println("Counter reset. End of function.");
    }

    public void function5() {
        int factorial = 1;
        System.out.println("Calculating factorial...");
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
            System.out.println("Multiplied by " + i + ". Factorial now: " + factorial);
        }
        System.out.println("Factorial of 5 is " + factorial);
        int sum = 0;
        for (int i = 1; i <= 4; i++) {
            sum += i;
            System.out.println("Added " + i + " to sum. Sum now: " + sum);
        }
        System.out.println("Sum of numbers from 1 to 5 is " + sum);
        System.out.println("End of calculations.");
    }
}
