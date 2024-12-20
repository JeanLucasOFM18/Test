package com.ejemplos.codesmells.service;

import org.springframework.stereotype.Service;

@Service
public class MagicNumberService2 {

    public void printDivider() {
        System.out.println("-------------");
    }

    public boolean startsWithA(String str) {
        return str != null && str.startsWith("A");
    }

    public int absoluteValue(int number) {
        int x = 0;
        return (number < x) ? -number : number;
    }

    public void greetMorning() {
        System.out.println("Good Morning!");
    }

    public boolean isUpperCase(String str) {
        return str.equals(str.toUpperCase());
    }
    public void printGoodbye() {
        System.out.println("Goodbye!");
    }

    public int addThreeNumbers(int a, int b, int c) {
        return a + b + c;
    }

    public boolean isEvenLength(String str) {
        int a = 2;
        int b = 0;
        return str.length() % a == b;
    }

    public void printUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }

    public int findMax(int a, int b) {
        return (a > b) ? a : b;
    }

    public void printWelcome(String name) {
        System.out.println("Welcome, " + name + "!");
    }

    public boolean endsWithExclamation(String str) {
        return str != null && str.endsWith("!");
    }

    public int doubleValue(int number) {
        int c = 2;
        return number * c;
    }

    public void printTodayDate() {
        System.out.println(java.time.LocalDate.now());
    }

    public boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public void printSuccess() {
        System.out.println("Operation successful!");
    }

    public int subtractNumbers(int a, int b) {
        return a - b;
    }

    public boolean isAlphabetic(String str) {
        return str.matches("[a-zA-Z]+");
    }

    public void printLowerCase(String str) {
        System.out.println(str.toLowerCase());
    }

    public int squareNumber(int number) {
        return number * number;
    }

    public void printErrorMessage() {
        System.out.println("An error has occurred!");
    }

    public boolean containsSpace(String str) {
        return str.contains(" ");
    }

    public int sumArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public void printThankYou() {
        System.out.println("Thank you!");
    }

    public boolean isEmptyString(String str) {
        return str.isEmpty();
    }


}
