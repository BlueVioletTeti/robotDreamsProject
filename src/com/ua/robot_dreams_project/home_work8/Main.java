package com.ua.robot_dreams_project.home_work8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 10;
        int[] arr = new int[length];
        createArray(arr, 18);
        printArray(arr);
        showMinNumber(arr);
        showMaxValue(arr);
        showAverageNumber(arr);
        showSumOfElements(arr);
    }

    static void createArray(int[] arr, int maxNumber) {
        Random randNum = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randNum.nextInt(maxNumber);
        }
    }

    static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    static void showMinNumber(int[] arr) {
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println(minValue);
    }

    static void showMaxValue(int[] arr) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        System.out.println(maxValue);
    }

    static void showAverageNumber(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float average = (float) sum / arr.length;
        System.out.println(average);
    }

    static void showSumOfElements(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println(sum);
    }
}
