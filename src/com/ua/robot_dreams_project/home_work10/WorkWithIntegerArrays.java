package com.ua.robot_dreams_project.home_work10;

import java.util.Random;

public class WorkWithIntegerArrays {
    private int[] arr;

    public WorkWithIntegerArrays(int length) {
        this.arr = new int[length];
    }


    public void fillArray(int maxNumber) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(maxNumber);
        }
    }

    public void sortArray(boolean ifAscending) {
        if (ifAscending) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[i]) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > arr[i]) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
    }

    public void printArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
