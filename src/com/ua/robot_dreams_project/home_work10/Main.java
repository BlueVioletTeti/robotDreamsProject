package com.ua.robot_dreams_project.home_work10;

public class Main {
    public static void main(String[] args) {
        WorkWithIntegerArrays arr = new WorkWithIntegerArrays(10);
        arr.fillArray(30);
        arr.printArray();
        arr.sortArray(true);
        arr.printArray();
    }
}
