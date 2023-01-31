package com.ua.robot_dreams_project.home_work7;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberToThePower(5, 3));
        System.out.println(multiplySymbolNumberTimes(7));
        System.out.println(multiplySymbolNumberTimes("%", 9));
//      Extra experiment
        System.out.println(multiplySymbolNumberTimes("Gleep", "! ", 17));
    }

    public static int numberToThePower(int number, int power) {
        number = (int) Math.pow(number, power);
        return number;
    }

    public static String multiplySymbolNumberTimes(int number) {
        return multiplySymbolNumberTimes("*", number);
    }

    public static String multiplySymbolNumberTimes(String symbol, int number) {
        String symbolNumberTimes = "";
        for (int i = 0; i < number; i++) {
            symbolNumberTimes += symbol;
        }
        return symbolNumberTimes;
    }

    public static String multiplySymbolNumberTimes(String text, String separator, int number) {
        String textNumberTimes = "";
        for (int i = 0; i < number; i++) {
            textNumberTimes += text + separator;
        }
        return textNumberTimes.trim();
    }
}
