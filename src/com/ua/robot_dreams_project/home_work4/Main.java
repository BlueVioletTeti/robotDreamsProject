package com.ua.robot_dreams_project.home_work4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//HomeWork
        String str = "Happy New Year!";
        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length()-1));
//Practice
        System.out.println(str.substring(3,7));
        str=str.concat(" And Merry Christmas!");
        System.out.println(str);
        System.out.println(str.contains("ry"));
        System.out.println(str.startsWith("M"));
        System.out.println(str.endsWith("!"));
        System.out.println(str.indexOf("Y"));
        System.out.println(str.indexOf("Merry"));
        System.out.println(str.replace("! And"," and"));
        String str1="  hi  there!             ";
        System.out.println(str1.trim());
        String str2="hello@gmail.com";
        System.out.println(str2.matches(".*@.*.com.*"));
        System.out.println(str);
        System.out.println(Arrays.toString(str.split("! ")));

    }
}

