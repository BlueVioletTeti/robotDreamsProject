package com.ua.robot_dreams_project.home_work7;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberToThePower(5, 3));
        System.out.println(multiplyAsteriskNumberTimes(7));
        System.out.println(multiplySymbolNumberTimes("Gleep", 9));
    }

    public static int numberToThePower(int number, int power) {
        number = (int) Math.pow(number, power);
        return number;
    }

    public static String multiplyAsteriskNumberTimes(int number) {
        String asterisk = "*";
        String asteriskNumber = "";
        for (int i = 0; i < number; i++) {
            asteriskNumber += asterisk;
        }
        return asteriskNumber;
    }

    public static String multiplySymbolNumberTimes(String symbol, int number) {
        String symbolNumberTimes = "";
        for (int i = 0; i < number; i++) {
            symbolNumberTimes += symbol + "! ";
        }
        return symbolNumberTimes.trim();
    }
}
