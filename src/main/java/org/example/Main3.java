package org.example;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        b = scanner.nextInt();

        int div;
        try {
            div = a / b;
            System.out.println(a + " Divisible by " + b + " is: " + div);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero. Please try again.");
        }

    }
}
