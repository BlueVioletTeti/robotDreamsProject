package com.ua.robot_dreams_project.home_work19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        1. У циклі на 1000 повтореннь сгенерувати випадкові числі діапазоном від 1 до 50 за
//        зберегти їх у різні типи колекцій сет
//        2. Вивести всі 3 варіанти на консоль
        Set<Integer> s1 = new HashSet<>();
        fillSet(s1);
        System.out.println(s1);

        Set<Integer> s2 = new LinkedHashSet<>();
        fillSet(s2);
        System.out.println(s2);

        Set<Integer> s3 = new TreeSet<>();
        fillSet(s3);
        System.out.println(s3);
    }

    private static void fillSet(Set<Integer> set) {
        Random random = new Random();
        int maxNumber = 50;
        int length = 1000;
        for (int i = 0; i < length; i++) {
            set.add(random.nextInt(maxNumber)+1);
        }
    }
}
