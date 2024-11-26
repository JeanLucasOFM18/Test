package com.ejemplos.codesmells.service;

import org.springframework.stereotype.Service;

@Service
public class ManyParametersService {

    public void function1(int a, int b, int c, int d, int e) {
        System.out.println("Parameters: " + a + ", " + b + ", " + c + ", " + d + ", " + e);
    }

    public void function2(String name, int age, double salary, boolean isActive, char grade) {
        System.out.println("Employee: " + name + ", Age: " + age + ", Salary: " + salary + ", Active: " + isActive + ", Grade: " + grade);
    }

    public void function3(int x, int y, int z, int w, int v, int u) {
        int sum = x + y + z + w + v + u;
        System.out.println("Sum: " + sum);
    }

    public void function4(double a, double b, double c, double d, double e, double f, double g) {
        double average = (a + b + c + d + e + f + g) / 7;
        System.out.println("Average: " + average);
    }

    public void function5(String firstName, String lastName, int age, String city, String country, String phone) {
        System.out.println("Name: " + firstName + " " + lastName + ", Age: " + age + ", Location: " + city + ", " + country + ", Phone: " + phone);
    }

    public void function6(int a, int b, int c, int d, int e, int f, int g, int h) {
        System.out.println("Max parameter count reached: " + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f + ", " + g + ", " + h);
    }

    public void function7(boolean flag1, boolean flag2, boolean flag3, boolean flag4, boolean flag5) {
        System.out.println("Flags: " + flag1 + ", " + flag2 + ", " + flag3 + ", " + flag4 + ", " + flag5);
    }

    public void function8(String param1, String param2, String param3, String param4, String param5, String param6) {
        System.out.println("Strings: " + param1 + ", " + param2 + ", " + param3 + ", " + param4 + ", " + param5 + ", " + param6);
    }

    public void function9(int a, int b, int c, int d, int e, int f, int g, int h, int i) {
        System.out.println("Adding nine parameters: " + (a + b + c + d + e + f + g + h + i));
    }

    public void function10(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j) {
        System.out.println("Concatenating parameters: " + a + b + c + d + e + f + g + h + i + j);
    }


}
