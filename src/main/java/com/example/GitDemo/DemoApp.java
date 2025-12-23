package com.example.GitDemo;

public class DemoApp {

    public static void main(String[] args) {
        System.out.println("Application started");

        greetUser("Ram");
        int sum = addNumbers(10, 20);
        System.out.println("Sum is: " + sum);

        printStatus();
    }

    static void greetUser(String name) {
        System.out.println("Hello " + name);
    }

    static int addNumbers(int a, int b) {
        return a + b;
    }

    static void printStatus() {
        System.out.println("Application running successfully");
        System.out.println("Application running successfully again ");

    }
}
