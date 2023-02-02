package com.ua.robot_dreams_project.home_work7;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberToThePower(5, 3));
        multiplySymbolNumberTimes(7);
        multiplySymbolNumberTimes("%", 9);
//      Extra experiments
        System.out.println(multiplySymbolNumberTimes("Gleep", "! ", 17));
        fibonacci(0, 1, 100);
    }

    public static int numberToThePower(int number, int power) {
        number = (int) Math.pow(number, power);
        return number;
    }

    public static void multiplySymbolNumberTimes(int number) {
        multiplySymbolNumberTimes("*", number);
    }

    public static void multiplySymbolNumberTimes(String symbol, int number) {
        String symbolNumberTimes = "";
        for (int i = 0; i < number; i++) {
            symbolNumberTimes += symbol;
        }
        System.out.println(symbolNumberTimes);
    }

    public static String multiplySymbolNumberTimes(String text, String separator, int number) {
        String textNumberTimes = "";
        for (int i = 0; i < number; i++) {
            textNumberTimes += text + separator;
        }
        return textNumberTimes.trim();
    }


    public static void fibonacci(int previousNumber, int currentNumber, int limit) {
        int result = previousNumber+currentNumber;
        previousNumber = currentNumber;
        currentNumber=result;
        if (previousNumber < limit) {
            System.out.print(previousNumber+" ");
            fibonacci(previousNumber,currentNumber,limit);
        }
    }
}

