package com.ua.robot_dreams_project.home_work17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        1. Створити програму для збереження списку чисел з 10 елементів та іншого з 2 000 000 елементів.
//        Для кожного підібрати свій тип
//        2. Зберегти у колекції список студентів (класс Студент теж створити)
//        3. Вивести цей список
//        4. Опціонально: написати реалізацію класу ArrayList або LinkedList
        int length1 = 10;
        int length2 = 2000000;

        List<Integer> list1 = new ArrayList<>(length1);
        Main.fillIntArray(list1, length1);
        System.out.println(list1);

        List<Integer> list2 = new LinkedList<>();
        Main.fillIntArray(list2, length2);
        System.out.println(list2);

        List<Student> list3 = new ArrayList<>(length1);
        fillStudentArray(list3, length1);
        System.out.println(list3);

        List<Student> list4 = new LinkedList<>();
        fillStudentArray(list4, length2);
        System.out.println(list4);

    }

    private static void fillIntArray(List<Integer> list, int length) {
        Random random = new Random();
        int maxNumber = 20;
        for (int i = 0; i < length; i++) {
            list.add(random.nextInt(maxNumber));
        }
    }

    private static void fillStudentArray(List<Student> list, int length) {
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            Student student = new Student();
            student.setId(i);

            int nameLength = 5;
            StringBuilder randomName = new StringBuilder();
            for (int j = 0; j < nameLength; j++) {
                char c = (char) (random.nextInt(26) + 'a');
                randomName.append(c);
            }
            student.setName(randomName.toString());

            int surnameLength = 7;
            StringBuilder randomSurname = new StringBuilder();
            for (int j = 0; j < surnameLength; j++) {
                char c = (char) (random.nextInt(26) + 'a');
                randomSurname.append(c);
            }
            student.setName(randomName.toString());
            student.setSurname(randomSurname.toString());

            Random randomGrade = new Random();
            int maxGrade = 100;
            student.setGrade(randomGrade.nextInt(maxGrade));

            list.add(student);
        }
    }


}
