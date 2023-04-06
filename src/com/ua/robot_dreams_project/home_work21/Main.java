package com.ua.robot_dreams_project.home_work21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Створити клас студент з полями Прізвище та Середній бал. Написати два компаратори для сортування
//        по цим полям. У головному класі наповнити лист даними про студентів та відсортувати за допомогою
//         цих компараторів. Показати на консоль 3 варіанти листа: оригінальний та 2 відсортованих

        List<Student> students = new ArrayList<>();
        students.add(new Student("Greene", 84));
        students.add(new Student("Geller", 95));
        students.add(new Student("Tribbiani", 61));
        students.add(new Student("Bing", 91));
        students.add(new Student("Buffay", 72));
        System.out.println(students);
        Collections.sort(students, ((o1, o2) -> o1.getSurname().compareTo(o2.getSurname())));
        System.out.println(students);
        Collections.sort(students, Comparator.comparing(Student::getAverageGrade));
        System.out.println(students);
    }
}
