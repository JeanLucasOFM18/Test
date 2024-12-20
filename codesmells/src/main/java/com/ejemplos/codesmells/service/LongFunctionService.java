package com.ejemplos.codesmells.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Service
public class LongFunctionService {

    public void function1() {
        int a = 1, b = 2, c = 3, d = 4, e = 5;
        int sum = 0;
        System.out.println("Starting calculation...");
        sum += a + b;
        System.out.println("Step 1: Added a and b. Sum: " + sum);
        sum += c;
        System.out.println("Step 2: Added c. Sum: " + sum);
        sum += d;
        System.out.println("Step 3: Added d. Sum: " + sum);
        sum += e;
        System.out.println("Step 4: Added e. Sum: " + sum);
        int product = a * b;
        System.out.println("Step 5: Multiplied a and b. Product: " + product);
        product *= c;
        System.out.println("Step 6: Multiplied by c. Product: " + product);
        product *= d;
        System.out.println("Step 7: Multiplied by d. Product: " + product);
        product *= e;
        System.out.println("Step 8: Multiplied by e. Product: " + product);
        System.out.println("Calculation complete. Sum: " + sum + ", Product: " + product);
    }

    public void function2() {
        String message = "Processing string:";
        System.out.println(message);
        for (int i = 1; i <= 5; i++) {
            message += " Step" + i;
            System.out.println("Added Step " + i + " to message.");
        }
        System.out.println("String after steps: " + message);
        for (int i = 1; i <= 3; i++) {
            message += " Final" + i;
            System.out.println("Added Final " + i + " to message.");
        }
        System.out.println("String after finals: " + message);
        String finalMessage = message + " - Completed!";
        System.out.println("Final message: " + finalMessage);
    }

    public void function3() {
        int[] values = new int[10];
        System.out.println("Initializing array...");
        for (int i = 0; i < values.length; i++) {
            values[i] = i * 2;
            System.out.println("Set position " + i + " to " + values[i]);
        }
        System.out.println("Array initialized.");
        int total = 0;
        for (int value : values) {
            total += value;
            System.out.println("Added " + value + " to total. Total now: " + total);
        }
        System.out.println("Total sum of array: " + total);
        for (int value : values) {
            if (value % 4 == 0) {
                System.out.println(value + " is a multiple of 4.");
            } else {
                System.out.println(value + " is not a multiple of 4.");
            }
        }
        System.out.println("Array processing complete.");
    }

    public void function4() {
        int counter = 0;
        System.out.println("Starting counter...");
        while (counter < 20) {
            counter++;
            if (counter % 3 == 0) {
                System.out.println(counter + " is divisible by 3.");
            } else {
                System.out.println(counter + " is not divisible by 3.");
            }
        }
        System.out.println("Counter loop complete.");
        System.out.println("Checking counter value...");
        if (counter > 15) {
            System.out.println("Counter is greater than 15.");
        } else {
            System.out.println("Counter is 15 or less.");
        }
        counter = 0;
        System.out.println("Counter reset. End of function.");
    }

    public void function5() {
        int factorial = 1;
        System.out.println("Calculating factorial...");
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
            System.out.println("Multiplied by " + i + ". Factorial now: " + factorial);
        }
        System.out.println("Factorial of 5 is " + factorial);
        int sum = 0;
        for (int i = 1; i <= 4; i++) {
            sum += i;
            System.out.println("Added " + i + " to sum. Sum now: " + sum);
        }
        System.out.println("Sum of numbers from 1 to 5 is " + sum);
        System.out.println("End of calculations.");
    }

    public void function6() {
        String sentence = "Building a sentence:";
        System.out.println(sentence);
        for (int i = 1; i <= 5; i++) {
            sentence += " Part" + i;
            System.out.println("Added Part" + i + " to sentence.");
        }
        sentence += " End.";
        System.out.println("Final sentence: " + sentence);
        for (int i = 1; i <= 2; i++) {
            System.out.println("Revisiting Part" + i + " in sentence.");
        }
        System.out.println("Sentence building loading.");
        System.out.println("Sentence building incomplete.");
        System.out.println("Sentence building complete.");
    }

    public void function7() {
        String alphabet = "Alphabet:";
        System.out.println("Starting alphabet...");
        for (char c = 'A'; c <= 'J'; c++) {
            alphabet += " " + c;
            System.out.println("Added letter " + c + " to alphabet.");
        }
        System.out.println("Alphabet so far: " + alphabet);
        for (char c = 'K'; c <= 'O'; c++) {
            alphabet += " " + c;
            System.out.println("Added letter " + c + " to alphabet.");
            System.out.println("Added");
        }
        System.out.println("Final alphabet: " + alphabet);
    }

    public void function8() {
        int x = 1;
        int y = 2;
        System.out.println("Starting values: x=" + x + ", y=" + y);
        for (int i = 0; i < 10; i++) {
            int temp = x + y;
            x = y;
            y = temp;
            System.out.println("Fibonacci step " + i + ": x=" + x + ", y=" + y);
        }
        System.out.println("Fibonacci sequence complete.");
        System.out.println("Loading");
        System.out.println("Final values: x=" + x + ", y=" + y);
    }

    public void function9() {
        int result = 1;
        System.out.println("Starting multiplication...");
        for (int i = 1; i <= 10; i++) {
            result *= i;
            System.out.println("Multiplied by " + i + ". Result now: " + result);
        }
        System.out.println("First phase complete.");
        int subtraction = 100;
        for (int i = 1; i <= 5; i++) {
            subtraction -= i;
            System.out.println("Subtracted " + i + " from total. Result now: " + subtraction);
        }
        System.out.println("Final result after subtraction: " + subtraction);
        System.out.println("Multiplication and subtraction complete.");
    }

    public void function10() {
        System.out.println("Checking conditions...");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even.");
            } else {
                System.out.println(i + " is odd.");
            }
        }
        System.out.println("First condition check complete.");
        for (int i = 11; i <= 20; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " is divisible by 3.");
            } else {
                System.out.println(i + " is not divisible by 3.");
            }
        }
        System.out.println("Second condition check complete.");
    }

    public void function11() {
        System.out.println("Calculating factorial...");
        int result = 1;
        for (int i = 1; i <= 10; i++) {
            result *= i;
            System.out.println("Factorial at " + i + ": " + result);
        }
        System.out.println("Factorial calculation complete.");
        System.out.println("Now calculating reverse factorial...");
        for (int i = 10; i > 0; i--) {
            result /= i;
            System.out.println("Reverse factorial at " + i + ": " + result);
        }
        System.out.println("Reverse factorial complete.");
    }

    public void function12() {
        int sum = 0;
        int product = 1;
        System.out.println("Processing numbers...");
        for (int i = 1; i <= 10; i++) {
            sum += i;
            product *= i;
            System.out.println("Sum at " + i + ": " + sum + ", Product at " + i + ": " + product);
        }
        System.out.println("Switching to even numbers...");
        for (int i = 2; i <= 20; i += 2) {
            sum += i;
            product *= i;
            System.out.println("Sum at " + i + ": " + sum + ", Product at " + i + ": " + product);
        }
        System.out.println("Processing complete.");
    }

    public void function13() {
        String result = "";
        System.out.println("Generating alphabet...");
        for (char c = 'A'; c <= 'Z'; c++) {
            result += c + " ";
            System.out.println("Appended " + c + " to result.");
        }
        System.out.println("Alphabet generated: " + result);
        result = "";
        System.out.println("Generating reverse alphabet...");
        for (char c = 'Z'; c >= 'A'; c--) {
            result += c + " ";
            System.out.println("Appended " + c + " to result.");
        }
        System.out.println("Reverse alphabet: " + result);
    }

    public void function14() {
        System.out.println("Creating multiplication table...");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
        System.out.println("Multiplication table complete.");
        System.out.println("Calculating sums for each row...");
        for (int i = 1; i <= 4; i++) {
            int rowSum = 0;
            for (int j = 1; j <= 3; j++) {
                rowSum += (i * j);
            }
            System.out.println("Sum of row " + i + ": " + rowSum);
        }
    }

    public void function15() {
        int[][] matrix = new int[4][4];
        System.out.println("Initializing matrix...");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = i * j;
                System.out.println("Matrix[" + i + "][" + j + "] = " + matrix[i][j]);
            }
        }
        System.out.println("Calculating diagonal sum...");
        int diagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            diagonalSum += matrix[i][i];
        }
        System.out.println("Diagonal sum: " + diagonalSum);
    }

    public void function16() {
        System.out.println("Counting characters in a string...");
        String input = "Programming is a skill that improves with practice.";
        int vowels = 0, consonants = 0, spaces = 0, others = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("AEIOUaeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            } else {
                others++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Spaces: " + spaces);
        System.out.println("Other characters: " + others);
        System.out.println("Character counting complete.");
    }

    public void function17() {
        System.out.println("Simulating a simple calculator...");
        int a = 10, b = 5;
        System.out.println("Values: a = " + a + ", b = " + b);

        int sum = a + b;
        System.out.println("Sum: " + sum);

        int difference = a - b;
        System.out.println("Difference: " + difference);

        int product = a * b;
        System.out.println("Product: " + product);

        if (b != 0) {
            int division = a / b;
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        System.out.println("Calculator simulation complete.");
    }

    public void function18() {
        System.out.println("Simulating temperature analysis...");
        double[] temperatures = {18.5, 20.1, 22.3, 19.0, 21.5, 23.8, 18.9};
        double total = 0;

        for (double temp : temperatures) {
            total += temp;
            System.out.println("Temperature recorded: " + temp);
        }

        double average = total / temperatures.length;
        System.out.println("Average temperature: " + average);

        for (double temp : temperatures) {
            if (temp > average) {
                System.out.println(temp + " is above average.");
            } else {
                System.out.println(temp + " is below or equal to average.");
            }
        }

        System.out.println("Temperature analysis complete.");
    }

    public void function19() {
        System.out.println("Creating multiplication and addition tables...");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int product = i * j;
                int sum = i + j;
                int rest = i - j;
                System.out.println(i + " x " + j + " = " + product + ", " + i + " + " + j + " = " + sum);
                System.out.println(i + " x " + " = " + product + ", " + i + " + " + j + " = " + sum);
                System.out.println(i + " x " + " = " + product + ", " + i + " + " + j + " = " + rest);
            }
        }
        System.out.println("Tables incomplete.");
        System.out.println("Loading.");
        System.out.println("Tables complete.");
    }

    public void function20() {
        System.out.println("Simulating a banking transaction...");
        double balance = 1000.0;
        double[] transactions = {200.0, -150.0, -50.0, 300.0, -100.0};

        for (double transaction : transactions) {
            balance += transaction;
            System.out.println("Transaction: " + transaction + ", Balance now: " + balance);
            if (balance < 0) {
                System.out.println("Warning: Balance is negative!");
            }
        }

        System.out.println("Final balance: " + balance);
        System.out.println("Loading ");
        System.out.println("Banking transaction simulation complete.");
    }

    public void function21() {
        System.out.println("Analyzing rainfall data...");
        double[] rainfall = {12.5, 15.0, 10.8, 9.6, 14.3, 11.2, 13.9};
        double total = 0;
        double max = rainfall[0];
        double min = rainfall[0];

        for (double rain : rainfall) {
            total += rain;
            if (rain > max) {
                max = rain;
            }
            if (rain < min) {
                min = rain;
            }
            System.out.println("Rainfall recorded: " + rain);
        }

        double average = total / rainfall.length;
        System.out.println("Total rainfall: " + total);
        System.out.println("Average rainfall: " + average);
        System.out.println("Maximum rainfall: " + max);
        System.out.println("Minimum rainfall: " + min);
        System.out.println("Rainfall analysis complete.");
    }

    public void function22() {
        System.out.println("Simulating grades evaluation...");
        int[] grades = {85, 90, 78, 88, 92, 67, 75, 80};
        int total = 0;
        int countAbove80 = 0;

        for (int grade : grades) {
            total += grade;
            if (grade > 80) {
                countAbove80++;
            }
            System.out.println("Grade processed: " + grade);
        }

        double average = total / (double) grades.length;
        System.out.println("Average grade: " + average);
        System.out.println("Count of grades above 80: " + countAbove80);
        System.out.println("Grades evaluation complete.");
    }

    public void function23() {
        System.out.println("Simulating traffic light system...");
        String[] lights = {"Red", "Green", "Yellow"};
        for (int cycle = 1; cycle <= 5; cycle++) {
            System.out.println("Cycle " + cycle + " starts...");
            for (String light : lights) {
                switch (light) {
                    case "Red":
                        System.out.println("Red light on. Stop!");
                        break;
                    case "Green":
                        System.out.println("Green light on. Go!");
                        break;
                    case "Yellow":
                        System.out.println("Yellow light on. Slow down!");
                        break;
                }
            }
            System.out.println("Cycle " + cycle + " ends.");
        }
        System.out.println("Traffic light simulation complete.");
    }

    public void function24() {
        System.out.println("Simulating word frequency counter...");
        String text = "This is a simple test. This test is only a test.";
        String[] words = text.toLowerCase().split("\\W+");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            System.out.println("Processed word: " + word);
        }

        System.out.println("Word frequencies:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Word frequency counting complete.");
    }

    public void function25() {
        System.out.println("Simulating inventory management...");
        String[] items = {"Laptop", "Mouse", "Keyboard", "Monitor", "Printer"};
        int[] stock = {10, 25, 15, 8, 5};

        for (int i = 0; i < items.length; i++) {
            System.out.println("Item: " + items[i] + ", Stock: " + stock[i]);
            if (stock[i] < 10) {
                System.out.println("Warning: Stock for " + items[i] + " is low.");
            }
        }

        int totalStock = 0;
        for (int s : stock) {
            totalStock += s;
        }
        System.out.println("Total stock in inventory: " + totalStock);
        System.out.println("Inventory management simulation complete.");
    }
}
