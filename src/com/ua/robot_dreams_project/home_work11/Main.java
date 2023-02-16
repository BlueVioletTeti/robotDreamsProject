package com.ua.robot_dreams_project.home_work11;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println(car1.getCarType());

        Truck truck1 = new Truck();
        System.out.println(truck1.getCarType());

        PassengerCar psc1 = new PassengerCar();
        System.out.println(psc1.getCarType());

    }
}
