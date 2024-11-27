package com.ejemplos.codesmells.service;

public class DeadCodeService {

    public void function1() {
        int v = 10;
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


}
