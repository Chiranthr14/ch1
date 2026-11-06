package com.example;

public class EvenOdd {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static String check(int number) {
        return isEven(number) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java -jar even-odd.jar <number>");
            return;
        }
        try {
            int n = Integer.parseInt(args[0]);
            System.out.println(n + " is " + check(n));
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}
