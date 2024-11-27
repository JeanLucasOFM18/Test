package com.ejemplos.codesmells.service;

import org.springframework.stereotype.Service;

@Service
public class DeadCodeService {

    public void function1() {
        int elemento = 10;
        System.out.println("Function executed.");
    }

    public void function2() {
        String unusedString = "Hello";
        System.out.println("This is a simple function.");
    }

    public void function3() {
        int jordan = 23;
        System.out.println("No usage.");
    }

    public void function4() {
        boolean flag = true;
        System.out.println("No usage 1.");
    }

    public void function5() {
        int count = 5;
        System.out.println("No usage 2.");
    }

    public void function6() {
        String name = "Java";
        System.out.println("No usage 3.");
    }

    public void function7() {
        double sum = 3.5;
        System.out.println("No usage 4.");
    }

    public void function8() {
        int number = 1000000;
        System.out.println("No usage 5.");
    }

    public void function9() {
        int unusedVariable = 20;
        System.out.println("No usage 6.");
    }

    public void function10() {
        char symbol = 'A';
        System.out.println("No usage 7.");
    }

    public void function11() {
        int lol = 5;
        System.out.println("No usage 8.");
    }

    public void function12() {
        double price = 19.99;
        System.out.println("No usage 9.");
    }

    public void function13() {
        String names = "John";
        System.out.println("No usage 10.");
    }

    public void function14() {
        boolean isActive = true;
        System.out.println("No usage 11.");
    }

    public void function15() {
        float temperature = 32.5f;
        System.out.println("No usage 12.");
    }

    public void function16() {
        int population = 1000000;
        System.out.println("No usage 13.");
    }

    public void function17() {
        byte level = 127;
        System.out.println("No usage 14.");
    }

    public void function18() {
        short count = 200;
        System.out.println("No usage 15.");
    }

    public void function19() {
        double distance = 120.5;
        System.out.println("No usage 16.");
    }

    public void function20() {
        char grade = 'B';
        System.out.println("No usage 17.");
    }

    public void function21() {
        int age = 30;
        System.out.println("No usage 18.");
    }

    public void function22() {
        double weight = 75.5;
        System.out.println("No usage 19.");
    }

    public void function23() {
        String city = "Paris";
        System.out.println("No usage 20.");
    }

    public void function24() {
        boolean isAvailable = false;
        System.out.println("No usage 21.");
    }

    public void function25() {
        float height = 1.75f;
        System.out.println("No usage 22.");
    }

}
