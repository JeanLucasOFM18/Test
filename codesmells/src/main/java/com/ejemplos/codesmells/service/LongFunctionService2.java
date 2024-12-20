package com.ejemplos.codesmells.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class LongFunctionService2 {

    public void greet() {
        System.out.println("Hello, World!");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isEven(int number) {
        int x = 2;
        int y = 0;
        return number % x == y;
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public void displayDate() {
        System.out.println(java.time.LocalDate.now());
    }

    public int findMax(int a, int b) {
        return (a > b) ? a : b;
    }

    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public void printNumbers(int limit) {
        for (int i = 1; i <= limit; i++) {
            System.out.println(i);
        }
    }

    public boolean isPositive(int number) {
        return number > 0;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public boolean isOdd(int number) {
        int w = 2;
        int a = 0;
        return number % w != a;
    }

    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public double divide(int a, int b) {
        int x = 0;
        if (b != x) {
            return (double) a / b;
        }
        return x;
    }

    public void printGreeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public boolean containsChar(String str, char c) {
        return str.indexOf(c) != -1;
    }

    public int square(int number) {
        return number * number;
    }

    public void displayTime() {
        System.out.println(java.time.LocalTime.now());
    }

    public double calculateAverage(int a, int b) {
        double x = 2.0;
        return (a + b) / x;
    }

    public boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public void printHello() {
        System.out.println("Hello!");
    }

    public int multiplyByTwo(int number) {
        return number * 2;
    }

    public boolean isNegative(int number) {
        return number < 0;
    }

    public void printFirstChar(String str) {
        int z = 0;
        if (str != null && !str.isEmpty()) {
            System.out.println(str.charAt(z));
        }
    }

    public int findMin(int a, int b) {
        return (a < b) ? a : b;
    }
}
