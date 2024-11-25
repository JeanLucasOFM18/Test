package com.ejemplos.codesmells.service;

import org.springframework.stereotype.Service;

@Service
public class MagicNumberService2 {

    public void function26() {
        if (quantity < 5) { // Magic number 5
            System.out.println("You have fewer than 5 items.");
        } else if (quantity < 20) { // Magic number 20
            System.out.println("You have between 5 and 19 items.");
        } else {
            System.out.println("You have 20 or more items.");
        }
    }

    public void function27() {
        if (score == 100) { // Magic number 100
            System.out.println("Perfect score!");
        } else if (score >= 80) { // Magic number 80
            System.out.println("Great score!");
        } else {
            System.out.println("Needs improvement.");
        }
    }

    public void function28() {
        if (month == 12) { // Magic number 12
            System.out.println("It's December.");
        } else if (month == 6) { // Magic number 6
            System.out.println("It's June.");
        } else {
            System.out.println("It's not December or June.");
        }
    }

    public void function29() {
        if (day == 1) { // Magic number 1
            System.out.println("It's the first day of the month.");
        } else if (day == 15) { // Magic number 15
            System.out.println("It's the 15th day of the month.");
        } else {
            System.out.println("It's not the first or fifteenth day.");
        }
    }

    public void function30() {
        if (time < 10) { // Magic number 10
            System.out.println("It's before 10 AM.");
        } else if (time < 18) { // Magic number 18
            System.out.println("It's before 6 PM.");
        } else {
            System.out.println("It's after 6 PM.");
        }
    }

    public void function31() {
        if (score >= 50) { // Magic number 50
            System.out.println("You passed!");
        } else if (score >= 30) { // Magic number 30
            System.out.println("You need to improve.");
        } else {
            System.out.println("You failed.");
        }
    }

    public void function32() {
        if (timeSpent < 30) { // Magic number 30
            System.out.println("You spent less than 30 minutes.");
        } else if (timeSpent < 60) { // Magic number 60
            System.out.println("You spent between 30 and 60 minutes.");
        } else {
            System.out.println("You spent more than 60 minutes.");
        }
    }

    public void function33() {
        if (number > 1000) { // Magic number 1000
            System.out.println("The number is greater than 1000.");
        } else if (number > 100) { // Magic number 100
            System.out.println("The number is greater than 100 but less than or equal to 1000.");
        } else {
            System.out.println("The number is 100 or less.");
        }
    }

    public void function34() {
        if (age < 13) { // Magic number 13
            System.out.println("You are a child.");
        } else if (age < 18) { // Magic number 18
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are an adult.");
        }
    }

    public void function35() {
        if (speed < 40) { // Magic number 40
            System.out.println("You are driving slowly.");
        } else if (speed < 80) { // Magic number 80
            System.out.println("You are driving at a normal speed.");
        } else {
            System.out.println("You are speeding!");
        }
    }

    public void function36() {
        if (balance < 500) { // Magic number 500
            System.out.println("Balance is below 500.");
        } else if (balance < 1000) { // Magic number 1000
            System.out.println("Balance is between 500 and 1000.");
        } else {
            System.out.println("Balance is 1000 or more.");
        }
    }

    public void function37() {
        if (height > 170) { // Magic number 170
            System.out.println("You are tall.");
        } else if (height > 150) { // Magic number 150
            System.out.println("You are average height.");
        } else {
            System.out.println("You are short.");
        }
    }

    public void function38() {
        if (age < 18) { // Magic number 18
            System.out.println("You are underage.");
        } else if (age <= 65) { // Magic number 65
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }
    }

    public void function39() {
        if (temp < 10) { // Magic number 10
            System.out.println("It is cold.");
        } else if (temp < 25) { // Magic number 25
            System.out.println("It is moderate.");
        } else {
            System.out.println("It is hot.");
        }
    }

    public void function40() {
        if (timeOfDay < 6) { // Magic number 6
            System.out.println("It's early morning.");
        } else if (timeOfDay < 12) { // Magic number 12
            System.out.println("It's morning.");
        } else if (timeOfDay < 18) { // Magic number 18
            System.out.println("It's afternoon.");
        } else {
            System.out.println("It's evening.");
        }
    }

    public void function41() {
        if (temperature < 0) { // Magic number 0
            System.out.println("Freezing temperature.");
        } else if (temperature < 10) { // Magic number 10
            System.out.println("Cold temperature.");
        } else {
            System.out.println("Warm temperature.");
        }
    }

    public void function42() {
        if (itemsInCart > 10) { // Magic number 10
            System.out.println("You have a large cart.");
        } else if (itemsInCart > 5) { // Magic number 5
            System.out.println("You have a medium cart.");
        } else {
            System.out.println("You have a small cart.");
        }
    }

    public void function43() {
        if (hoursWorked > 40) { // Magic number 40
            System.out.println("Overtime.");
        } else if (hoursWorked > 30) { // Magic number 30
            System.out.println("Full-time.");
        } else {
            System.out.println("Part-time.");
        }
    }

    public void function44() {
        if (quantity < 3) { // Magic number 3
            System.out.println("Low stock.");
        } else if (quantity < 10) { // Magic number 10
            System.out.println("Medium stock.");
        } else {
            System.out.println("High stock.");
        }
    }

    public void function45() {
        if (numberOfAttempts < 3) { // Magic number 3
            System.out.println("Few attempts made.");
        } else if (numberOfAttempts < 7) { // Magic number 7
            System.out.println("Moderate number of attempts.");
        } else {
            System.out.println("Too many attempts.");
        }
    }

    public void function46() {
        if (age < 16) { // Magic number 16
            System.out.println("You are too young to drive.");
        } else if (age < 18) { // Magic number 18
            System.out.println("You can drive with parental consent.");
        } else {
            System.out.println("You can drive freely.");
        }
    }

    public void function47() {
        if (score >= 90) { // Magic number 90
            System.out.println("Excellent!");
        } else if (score >= 75) { // Magic number 75
            System.out.println("Good job.");
        } else if (score >= 50) { // Magic number 50
            System.out.println("Needs improvement.");
        } else {
            System.out.println("Fail.");
        }
    }

    public void function48() {
        if (points > 1000) { // Magic number 1000
            System.out.println("You have a high score.");
        } else if (points > 500) { // Magic number 500
            System.out.println("You have a decent score.");
        } else {
            System.out.println("Low score.");
        }
    }

    public void function49() {
        if (distance < 100) { // Magic number 100
            System.out.println("You are close.");
        } else if (distance < 500) { // Magic number 500
            System.out.println("You are at a moderate distance.");
        } else {
            System.out.println("You are far away.");
        }
    }

    public void function50() {
        if (amount < 50) { // Magic number 50
            System.out.println("Amount is too low.");
        } else if (amount < 100) { // Magic number 100
            System.out.println("Amount is moderate.");
        } else {
            System.out.println("Amount is high.");
        }
    }

}
