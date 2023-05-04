package com.ua.robot_dreams_project.home_work33;

public class Main {
    public static void main(String[] args) {
//        Створити поток який генерує числа від 1 до 10 і нескінченно їх виводить на консоль.
//        Якщо згенероване число == 5 - то перервати роботу потоку
        MyThread myRunableThread = new MyThread();
        Thread thread0 = new Thread(myRunableThread);
        thread0.start();

    }
}