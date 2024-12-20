package com.ejemplos.codesmells.service;

import org.springframework.stereotype.Service;

@Service
public class DuplicateCodeService {

    public void function1() {
        System.out.println("Processing data...");
        System.out.println("Data processed successfully.");
        System.out.println("Processing data...");
        System.out.println("Data processed successfully.");
    }

    public void function2() {
        int a = 10, b = 20;
        System.out.println("Sum: " + (a + b));
        System.out.println("Sum: " + (a + b));
    }

    public void function3() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Iteration " + i);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Iteration " + i);
        }
    }

    public void function4() {
        int x = 5;
        System.out.println("Value: " + x);
        System.out.println("Value: " + x);
    }

    public void function5() {
        String message = "Hello World!";
        System.out.println(message);
        System.out.println(message);
    }

    public void function6() {
        if (true) {
            System.out.println("Condition met.");
        }
        if (true) {
            System.out.println("Condition met.");
        }
    }

    public void function7() {
        int num = 100;
        System.out.println("Number: " + num);
        System.out.println("Number: " + num);
    }

    public void function8() {
        System.out.println("Starting process...");
        System.out.println("Executing step 1...");
        System.out.println("Starting process...");
        System.out.println("Executing step 1...");
    }

    public void function9() {
        String s = "Duplicate";
        System.out.println(s + " found.");
        System.out.println(s + " found.");
    }

    public void function10() {
        for (int j = 1; j <= 2; j++) {
            System.out.println("Running task " + j);
        }
        for (int j = 1; j <= 2; j++) {
            System.out.println("Running task " + j);
        }
    }

    public void function11() {
        int value = 42;
        System.out.println("The value is: " + value);
        System.out.println("The value is: " + value);
    }

    public void function12() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Loop iteration: " + i);
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Loop iteration: " + i);
        }
    }

    public void function13() {
        System.out.println("Logging in...");
        System.out.println("Welcome!");
        System.out.println("Logging in...");
        System.out.println("Welcome!");
    }

    public void function14() {
        String greeting = "Hi there!";
        System.out.println(greeting);
        System.out.println(greeting);
    }

    public void function15() {
        if (true) {
            System.out.println("Success!");
        }
        if (true) {
            System.out.println("Success!");
        }
    }

    public void function16() {
        int a = 5, b = 15;
        int sum = a + b;
        System.out.println("Sum is: " + sum);
        System.out.println("Sum is: " + sum);
    }

    public void function17() {
        String message = "Error detected!";
        System.out.println(message);
        System.out.println(message);
    }

    public void function18() {
        System.out.println("Initiating sequence...");
        System.out.println("Sequence active.");
        System.out.println("Initiating sequence...");
        System.out.println("Sequence active.");
    }

    public void function19() {
        int num = 2;
        System.out.println("Number: " + num);
        System.out.println("Number: " + num);
    }

    public void function20() {
        int x = 10;
        System.out.println("Value: " + x);
        System.out.println("Value: " + x);
    }

    public void function21() {
        System.out.println("Checking system status...");
        System.out.println("System is online.");
        System.out.println("Checking system status...");
        System.out.println("System is online.");
    }

    public void function22() {
        int a = 3, b = 7;
        System.out.println("Product: " + (a * b));
        System.out.println("Product: " + (a * b));
    }

    public void function23() {
        String error = "Connection lost!";
        System.out.println(error);
        System.out.println(error);
    }

    public void function24() {
        for (int i = 1; i <= 2; i++) {
            System.out.println("Running operation " + i);
        }
        for (int i = 1; i <= 2; i++) {
            System.out.println("Running operation " + i);
        }
    }

    public void function25() {
        int a = 2;
        int b = 1;
        int c = 3;
        if (b + a == c) {
            System.out.println("Math is correct.");
        }
        if (b + a == c) {
            System.out.println("Math is correct.");
        }
    }

}
