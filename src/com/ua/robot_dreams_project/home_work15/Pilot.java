package com.ua.robot_dreams_project.home_work15;

public class Pilot extends Human implements Flyable, Drivable {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }

    @Override
    public void drive() {
        System.out.println("And I'm also driving");
    }
}
