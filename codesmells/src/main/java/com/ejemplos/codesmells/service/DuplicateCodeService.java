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

}
