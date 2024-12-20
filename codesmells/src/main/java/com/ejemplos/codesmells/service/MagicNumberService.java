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

    public void function6() {
        if (x > 50) { // Magic number 50
            System.out.println("x is greater than 50");
        } else {
            System.out.println("x is less than or equal to 50");
        }
    }

    public void function7() {
        if (score == 100) { // Magic number 100
            System.out.println("Perfect score!");
        } else if (score > 50) { // Magic number 50
            System.out.println("You passed!");
        } else {
            System.out.println("Try again.");
        }
    }

    public void function8() {
        if (age >= 18) { // Magic number 18
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
    }

    public void function9() {
        if (number % 2 == 0) { // Magic number 2
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }

    public void function10() {
        if (temperature > 30) { // Magic number 30
            System.out.println("It's hot outside.");
        } else if (temperature > 15) { // Magic number 15
            System.out.println("It's warm outside.");
        } else {
            System.out.println("It's cold outside.");
        }
    }

    public void function11() {
        if (score < 20) { // Magic number 20
            System.out.println("Your score is less than 20.");
        } else if (score >= 50) { // Magic number 50
            System.out.println("You passed!");
        } else {
            System.out.println("Your score is between 20 and 50.");
        }
    }

    public void function12() {
        if (hour < 12) { // Magic number 12
            System.out.println("Good morning!");
        } else if (hour < 18) { // Magic number 18
            System.out.println("Good afternoon!");
        } else {
            System.out.println("Good evening!");
        }
    }

    public void function13() {
        if (number >= 100) { // Magic number 100
            System.out.println("The number is 100 or greater.");
        } else if (number >= 50) { // Magic number 50
            System.out.println("The number is between 50 and 99.");
        } else {
            System.out.println("The number is less than 50.");
        }
    }

    public void function14() {
        if (year % 4 == 0) { // Magic number 4
            System.out.println("It's a leap year.");
        } else {
            System.out.println("It's not a leap year.");
        }
    }

    public void function15() {
        if (numItems == 10) { // Magic number 10
            System.out.println("You have exactly 10 items.");
        } else if (numItems > 10) { // Magic number 10
            System.out.println("You have more than 10 items.");
        } else {
            System.out.println("You have fewer than 10 items.");
        }
    }

    public void function16() {
        if (total > 500) { // Magic number 500
            System.out.println("Total is greater than 500.");
        } else if (total > 100) { // Magic number 100
            System.out.println("Total is greater than 100 but less than or equal to 500.");
        } else {
            System.out.println("Total is 100 or less.");
        }
    }

    public void function17() {
        if (age >= 65) { // Magic number 65
            System.out.println("You are eligible for senior benefits.");
        } else if (age >= 18) { // Magic number 18
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
    }

    public void function18() {
        if (number == 1) { // Magic number 1
            System.out.println("The number is one.");
        } else if (number == 10) { // Magic number 10
            System.out.println("The number is ten.");
        } else {
            System.out.println("The number is neither one nor ten.");
        }
    }

    public void function19() {
        if (score >= 90) { // Magic number 90
            System.out.println("You got an A!");
        } else if (score >= 75) { // Magic number 75
            System.out.println("You got a B.");
        } else {
            System.out.println("You need to study harder.");
        }
    }

    public void function20() {
        if (time < 6) { // Magic number 6
            System.out.println("It's very early in the morning.");
        } else if (time < 12) { // Magic number 12
            System.out.println("Good morning!");
        } else {
            System.out.println("Good afternoon or evening!");
        }
    }

    public void function21() {
        if (balance < 0) { // Magic number 0
            System.out.println("Balance is negative.");
        } else if (balance > 1000) { // Magic number 1000
            System.out.println("Balance is greater than 1000.");
        } else {
            System.out.println("Balance is between 0 and 1000.");
        }
    }

    public void function22() {
        if (height >= 180) { // Magic number 180
            System.out.println("You are tall.");
        } else if (height >= 150) { // Magic number 150
            System.out.println("You are of average height.");
        } else {
            System.out.println("You are short.");
        }
    }

    public void function23() {
        if (speed > 120) { // Magic number 120
            System.out.println("You are speeding!");
        } else if (speed > 60) { // Magic number 60
            System.out.println("You are driving at a moderate speed.");
        } else {
            System.out.println("You are driving slowly.");
        }
    }

    public void function24() {
        if (numParticipants > 100) { // Magic number 100
            System.out.println("More than 100 participants.");
        } else if (numParticipants == 50) { // Magic number 50
            System.out.println("Exactly 50 participants.");
        } else {
            System.out.println("Fewer than 50 participants.");
        }
    }

    public void function25() {
        if (temp >= 35) { // Magic number 35
            System.out.println("It's very hot.");
        } else if (temp >= 20) { // Magic number 20
            System.out.println("It's warm.");
        } else {
            System.out.println("It's cold.");
        }
    }


}
