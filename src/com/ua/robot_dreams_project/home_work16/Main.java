package com.ua.robot_dreams_project.home_work16;

public class Main {
    public static void main(String[] args) {
//        Створити метод - який за номером від 1 до 7 повертає день тижня, якому цей номер відповідає

        int number = 4;

        for (DayOfWeek day : DayOfWeek.values()) {
            if (day.ordinal() + 1 == number) {
                System.out.println("It's " + day + "!");
            }
        }
    }
}
