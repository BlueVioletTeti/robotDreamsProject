package com.ua.robot_dreams_project.home_work24;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ScannerException {
//        Створити виняток який викидається коли число менше нуля. Створити функцію, яка приймає число і
//        повертає його квадрат. Якщо число буде менше нуля - то викинути створений вийняток.
        System.out.println("Enter a positive number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

//        Option number 1
        int myWork = numberSquared(number);
        System.out.println(myWork);
        if (number < 0) {
            throw new ScannerException("Number out of range. It must be positive");
        }

//        Option number 2
        try {
            if (number >= 0) {
                int myWork2 = numberSquared(number);
                System.out.println("Your number to the second power is " + myWork2);
            } else {
                throw new IOException("My exception");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();

        }

//        Option 3
        try {
            myWork(number);
        } catch (Exception e) {
            throw new ScannerException("Negative numbers are not allowed");
        }
    }

    private static void myWork(int i) throws ScannerException {
        if (i >= 0) {
            int myWork = numberSquared(i);
            System.out.println("Your number to the second power is " + myWork);

        } else {
            throw new ScannerException();
        }
    }

    static int numberSquared(int number) {
        return number * number;
    }
}

