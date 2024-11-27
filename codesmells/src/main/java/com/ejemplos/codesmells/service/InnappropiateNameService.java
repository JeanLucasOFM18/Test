package com.ejemplos.codesmells.service;

import org.springframework.stereotype.Service;

@Service
public class InnappropiateNameService {

    public void x() {
        System.out.println("Function with an inappropriate name.");
    }

    public void y() {
        int a = 10, b = 5;
        System.out.println("Sum: " + (a + b));
    }

    public void z() {
        System.out.println("This is function z.");
    }

    public void a1() {
        System.out.println("Performing an undefined operation.");
    }

    public void b2() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Step: " + i);
        }
    }

    public void c3() {
        int result = 42;
        System.out.println("Result: " + result);
    }

    public void d4() {
        System.out.println("Processing data...");
    }

    public void e5() {
        String text = "Sample text";
        System.out.println(text);
    }

    public void e6() {
        System.out.println("This name is random and non-descriptive.");
    }

    public void l33t() {
        System.out.println("Elite name for a function, but not appropriate.");
    }


}
