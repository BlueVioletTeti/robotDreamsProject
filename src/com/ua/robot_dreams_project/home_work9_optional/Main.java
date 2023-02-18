package com.ua.robot_dreams_project.home_work9_optional;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hi there");
//        System.out.println(sb);
        sb.append("!");
//        System.out.println(sb);
        StringBuilder sb2 = sb.reverse();
//        System.out.println(sb2);

        String s = "It's Christmas time!";
        String reversedS = reverseS(s);
//        System.out.println(reversedS);
        String reversedSB = reverseSB(s);
//        System.out.println(reversedSB);

        int a = 10;
        String ifPositive = a > 0 ? "Yes" : "No";
//        System.out.println(ifPositive);


        int[] array = new int[10];
        fillArray(array);
        System.out.println(Arrays.toString(array));
        sortArray(array);
        System.out.println(Arrays.toString(array));
        int[][] arr2D = new int[5][5];
        fillTwoDimensionArray(arr2D);
        printTwoDimensionArray(arr2D);
        System.out.println();
        sortTwoDimensionsArrayByLine(arr2D);
        printTwoDimensionArray(arr2D);
        System.out.println();
        sortTwoDimensionsArrayFull(arr2D);
        printTwoDimensionArray(arr2D);
        sortTwoDimensionsArrayMainDiagonal(arr2D);
        printTwoDimensionArray(arr2D);
        System.out.println();
        sortTwoDimensionsArraySecondaryDiagonal(arr2D);
        printTwoDimensionArray(arr2D);
    }


    static String reverseS(String s) {
        String reversedS = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedS += s.charAt(i);
//            System.out.println(reversedS);
        }
        return reversedS;
    }

    static String reverseSB(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    static void fillArray(int[] arr) {
        Random random = new Random();
        for (int i = arr[0]; i < arr.length; i++) {
            arr[i] = random.nextInt(30);
        }
    }

    static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
//                System.out.println(Arrays.toString(arr));
            }
        }
    }

    static void fillTwoDimensionArray(int[][] arr2D) {

        Random random = new Random();
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = random.nextInt(10);
            }
        }
    }

    static void printTwoDimensionArray(int[][] arr2D) {

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + "\t");
            }
            System.out.println();
        }
//        System.out.println(Arrays.deepToString(arr2D));
    }

    static void sortTwoDimensionsArrayFull(int[][] arr2D) {
        for (int i = 0; i < arr2D.length; i++) {
            for (int n = 0; n < arr2D.length; n++) {
                for (int j = 0; j < arr2D.length; j++) {
                    for (int m = 0; m < arr2D.length; m++) {
                        if (arr2D[n][m] > arr2D[i][j]) {
                            int temp = arr2D[n][m];
                            arr2D[n][m] = arr2D[i][j];
                            arr2D[i][j] = temp;
                        }
                    }
                }
            }
        }
    }

    static void sortTwoDimensionsArrayByLine(int[][] arr2D) {
        for (int k = 0; k < arr2D.length; k++) {
            for (int i = 0; i < arr2D.length - 1; i++) {
                for (int j = i + 1; j < arr2D.length; j++) {
                    if (arr2D[k][j] < arr2D[k][i]) {
                        int temp = arr2D[k][i];
                        arr2D[k][i] = arr2D[k][j];
                        arr2D[k][j] = temp;
                    }
                }
            }
        }
    }

    static void sortTwoDimensionsArrayMainDiagonal(int[][] arr2D) {
        for (int i = 0; i < arr2D.length - 1; i++) {
            for (int j = i + 1; j < arr2D.length; j++) {
                if (arr2D[j][j] < arr2D[i][i]) {
                    int temp = arr2D[j][j];
                    arr2D[j][j] = arr2D[i][i];
                    arr2D[i][i] = temp;
                }
            }
        }
    }

    static void sortTwoDimensionsArraySecondaryDiagonal(int[][] arr2D) {
        for (int i = 0; i < arr2D.length - 1; i++) {
            for (int j = arr2D.length-1; j > 0; j--) {
                if (arr2D[i][j] < arr2D[i + 1][j - 1]) {
                    int temp = arr2D[i][j];
                    arr2D[i][j] = arr2D[i + 1][j - 1];
                    arr2D[i + 1][j - 1] = temp;
                }
            }
        }
    }
}




