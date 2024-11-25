package com.ejemplos.codesmells.service;

import org.springframework.stereotype.Service;

@Service
public class MagicNumberService {

    public void function1() {
        int score = 0;
        for (int i = 0; i < 100; i++) { // Magic number 100
            score += i;
        }
        System.out.println("Final score: " + score);
    }

    public void function2() {
        int result = 50 * 3; // Magic numbers 50 y 3
        System.out.println("Result is: " + result);
    }

    public void function3() {
        if (20 > 15) { // Magic numbers 20 y 15
            System.out.println("20 is greater than 15");
        }
    }

    public void function4() {
        double circleArea = 3.1416 * 10 * 10; // Magic numbers 3.1416 y 10
        System.out.println("Circle area: " + circleArea);
    }

    public void function5() {
        int items = 6;
        if (items < 5) { // Magic number 5
            System.out.println("Few items");
        } else if (items > 20) { // Magic number 20
            System.out.println("Too many items");
        }
    }
    
}
