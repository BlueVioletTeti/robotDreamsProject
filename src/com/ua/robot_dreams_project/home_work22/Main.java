package com.ua.robot_dreams_project.home_work22;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        1. Створити лист з 20 прізвищами. Вони повинні повторюватися. За допомогою стрім апі
//        перетворити цей лист на мапу. У якості ключа повинно бути прізвище, а я якості значення
//        кількість повторень його.
//        2. Заповнити лист випадковими числами. Знайти суму цих чисел за допомогою Stream API

//        Task 1 (option 1)
        List<String> list1 = List.of("Geller", "Geller", "Bing", "Tribbiani", "Tribbiani",
                "Geller", "Buffay", "Tribbiani", "Greene", "Greene", "Geller", "Bing", "Geller",
                "Greene", "Geller", "Tribbiani", "Tribbiani", "Bing", "Buffay", "Bing");
        Map<String, Long> result1 = list1.stream()
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
        System.out.println(result1);

//        Task 1 (option 2)
        Map<String, Long> result2 = list1.stream()
                .collect(Collectors.groupingBy(it -> it, Collectors.counting()));
        System.out.println(result2);

//        Task 2 with random numbers set by developer
        List<Integer> list2 = List.of(17, 12, 3, 40, 9, 12, 73, 4, 15, 0);
        Integer result3 = list2.stream()
                .mapToInt(i -> i)
                .sum();
        System.out.println(result3);

//        Task 2 with 10 random numbers (from 0 till 100) set by java
        Integer result4 = IntStream
                .generate(new Random()::nextInt)
                .limit(10)
                .map(i -> Math.abs(i) % 100)
                .sum();
        System.out.println(result4);
    }
}