package com.ua.robot_dreams_project.home_work33;

import java.util.Random;

public class MyThread implements Runnable {
    private int number;

    @Override
    public void run() {
        Random random = new Random();
        try {
            while (true) {
                number = random.nextInt(10);
                System.out.println(number);
                if (number == 5) {
                    throw new InterruptedException();
                }
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("The end");
        }
    }
}

