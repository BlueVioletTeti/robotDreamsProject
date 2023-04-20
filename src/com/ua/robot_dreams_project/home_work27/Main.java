package com.ua.robot_dreams_project.home_work27;

import java.io.File;

public class Main {
    public static void main(String[] args) {
//        Створити класс з 2 функціями. Перша зберігає отриману строку у файл.
//        Друга - зчитує дані з файлу та повертає його користувачу.
        WorkWithFiles homeWork = new WorkWithFiles(new File("text.txt"), "New lines with important content");
        homeWork.writeStringToFile();
        homeWork.readStringFromFile();
        System.out.println(homeWork.readStringFromFile());
//        homeWork.deleteFile();
    }
}
