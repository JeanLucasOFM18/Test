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
        System.out.println("No usage of x.");
    }

    public void function4() {
        boolean flag = true;
        System.out.println("Just a print statement.");
    }

    public void function5() {
        int count = 5;
        System.out.println("Function runs but count is not used.");
    }

    public void function6() {
        String name = "Java";
        System.out.println("No need for 'name' variable.");
    }

    public void function7() {
        double sum = 3.5;
        System.out.println("Variable sum isn't needed.");
    }

    public void function8() {
        long number = 1000000L;
        System.out.println("The variable 'number' is not utilized.");
    }

    public void function9() {
        int unusedVariable = 20;
        System.out.println("Nothing done with unusedVariable.");
    }

    public void function10() {
        char symbol = 'A';
        System.out.println("The symbol is just declared, not used.");
    }

    
}
