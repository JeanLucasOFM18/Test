package com.ejemplos.codesmells.service;

public class DeadCodeService {

    public void function1() {
        int unusedVar = 10;
        System.out.println("Function executed.");
    }

    public void function2() {
        String unusedString = "Hello";
        System.out.println("This is a simple function.");
    }

    public void function3() {
        double x = 0.0;
        System.out.println("No usage.");
    }

    public void function4() {
        boolean flag = true;
        System.out.println("No usage.");
    }

    public void function5() {
        int count = 5;
        System.out.println("No usage.");
    }

    public void function6() {
        String name = "Java";
        System.out.println("No usage.");
    }

    public void function7() {
        double sum = 3.5;
        System.out.println("No usage.");
    }

    public void function8() {
        long number = 1000000L;
        System.out.println("No usage.");
    }

    public void function9() {
        int unusedVariable = 20;
        System.out.println("No usage.");
    }

    public void function10() {
        char symbol = 'A';
        System.out.println("No usage.");
    }


}
