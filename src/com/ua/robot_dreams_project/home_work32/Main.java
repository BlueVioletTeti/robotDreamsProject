package com.ua.robot_dreams_project.home_work32;

public class Main {
    public static void main(String[] args) {
//  Створити 2 потоки, які паралельно виводять на консоль числа від 1 до 10 та пишуть назву потоку.
RunableThread runableThread = new RunableThread();
Thread thread0 = new Thread(runableThread);
Thread thread1 = new Thread(runableThread);

thread0.start();
thread1.start();
    }
}
