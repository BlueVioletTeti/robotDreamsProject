package com.ua.robot_dreams_project.home_work6;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (
                int i = 1;
                i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        int factorial = 1;
        for (int i = 1; i <= 7; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

        int fibonacci = 0;
        int i = 1;
        int iPrevious = 0;
        while (fibonacci < 100) {
            fibonacci = i + iPrevious;
            iPrevious = i;
            i = fibonacci;
            System.out.print(iPrevious + " ");
        }
    }
}


