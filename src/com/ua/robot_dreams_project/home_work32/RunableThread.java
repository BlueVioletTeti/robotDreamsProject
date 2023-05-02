package com.ua.robot_dreams_project.home_work32;

public class RunableThread implements Runnable {

    @Override
    public void run() {
        try{
            for (int i =0; i<10;i++){
                System.out.println("Thread: "+ Thread.currentThread().getName()+" "+i);
                Thread.sleep(500);
            }
        } catch(InterruptedException e){
            System.out.println("Goodbye");
        }
    }
}
