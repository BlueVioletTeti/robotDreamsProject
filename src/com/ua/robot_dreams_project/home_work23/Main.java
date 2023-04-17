package com.ua.robot_dreams_project.home_work23;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        1. Запросити з консолі число і огорнути цей функціонал у блоки обробки винятків.
//        2. При вводі замість числа  буков - показувати повідомлення про помилку на консоль.
//        3. За допомогою нескінченного циклу - запитувати число з консолі - поки не отримаємо
//        його без помилок
        printNumber();
    }

    public static void printNumber() {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        Integer number;

        while (true) {
            try {
                number = Integer.parseInt(scanner.nextLine());
                System.out.println("Thank you! " + number + " is a number");
                break;
            } catch (Exception e) {
                System.out.println("You have entered not a valid number. Please try again");
                System.out.println("Enter a number: ");
            }
        }
    }
}
