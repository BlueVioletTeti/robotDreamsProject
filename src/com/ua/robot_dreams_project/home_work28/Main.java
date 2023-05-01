package com.ua.robot_dreams_project.home_work28;

public class Main {
    public static void main(String[] args) {

//        Переробити програму з минулого завдання - але використовувати методи с пакету NIO.
//        Створити класс з 2 функціями. Перша зберігає отриману строку у файл.
//        Друга - зчитує дані з файлу та повертає його користувачу.

        WorkWithFilesNIO homeWork = new WorkWithFilesNIO("hw.txt", " + some new line");
        homeWork.write();
        homeWork.read();
    }
}
