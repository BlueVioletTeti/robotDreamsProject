package com.ua.robot_dreams_project.home_work20;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Мапа потрібна містити інформацію про 10 будь яких слів українською мовою і ії переклад на:
//        англійску, японську, німецьку. Коли користувач дає мапі слово украінською - то потрібен
//        отримати у результаті переклад на ці 3 мови

        Map<String, List<String>> map = new HashMap<>();
        map.put("Київ", List.of("Kyiv", "キエフ", "Kiew"));
        map.put("Лондон", List.of("London", "ロンドン", "London"));
        map.put("Париж", List.of("Paris", "パリ", "Paris"));
        map.put("Берлін", List.of("Berlin", "ベルリン", "Berlin"));
        map.put("Мадрид", List.of("Madrid", "マドリード", "Madrid"));
        map.put("Вашингтон", List.of("Washington", "ワシントン", "Washington"));
        map.put("Токіо", List.of("Tokio", "東京", "Tokyo"));
        map.put("Сінгапур", List.of("Singapore", "シンガポール", "Singapur"));
        map.put("Мехіко", List.of("Mexico", "メキシコ", "Mexiko"));
        map.put("Оттава", List.of("Ottawa", "オタワ", "Ottawa"));
        System.out.println(map);
        System.out.println();

        String enteredWord = "Київ";
        System.out.println("В перекладі англійською, японською та німецькою "+enteredWord+" це: "+map.getOrDefault(enteredWord,List.of("","",""))+".");
    }
}
