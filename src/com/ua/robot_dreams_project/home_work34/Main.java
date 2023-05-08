package com.ua.robot_dreams_project.home_work34;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        Створити callable поток, який повертає випадково згенероване число від 1 до 50.
//        Зробити пул с 10 потоків для виклику цього методу

        List<Callable<String>> callables = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            callables.add(new CallableRandomNumber());
        }

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<String>> futures = executorService.invokeAll(callables);

        for (Future<String> future : futures) {
            System.out.println(future.get());
        }
        executorService.shutdown();
    }

    public static class CallableRandomNumber implements Callable<String> {
        public String call() throws Exception {
            int randomNumber = new Random().nextInt(50);
            return String.valueOf(randomNumber);
        }
    }
}
