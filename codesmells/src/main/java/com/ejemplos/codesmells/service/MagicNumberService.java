package com.ejemplos.codesmells.service;

import org.springframework.stereotype.Service;

@Service
public class MagicNumberService {

    public void function1() {
        if (42 == 7 * 6) { // Magic numbers 42, 7, 6
            System.out.println("The answer is correct!");
        }
    }

    public void function2() {
        for (int i = 0; i < 12; i++) { // Magic number 12
            if (i % 4 == 0) { // Magic number 4
                System.out.println(i + " is divisible by 4");
            }
        }
    }

    public void function3() {
        if (20 > 15) { // Magic numbers 20 y 15
            System.out.println("20 is greater than 15");
        }
    }

    public void function4() {
        if (5 > 3 && 8 < 10) { // Magic numbers 5, 3, 8, 10
            System.out.println("Both conditions are true!");
        }
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
