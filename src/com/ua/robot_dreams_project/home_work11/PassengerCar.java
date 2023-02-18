package com.ua.robot_dreams_project.home_work11;

public class PassengerCar extends Car {
    private int maxPassengerNumber;

    public PassengerCar() {
    }

    public PassengerCar(int maxPassengerNumber) {
        this.maxPassengerNumber = maxPassengerNumber;
    }

    public PassengerCar(String model, String carType, String color, int horsepower, int maxPassengerNumber) {
        super(model, carType, color, horsepower);
        this.maxPassengerNumber = maxPassengerNumber;
    }

    public int getMaxPassengerNumber() {
        return maxPassengerNumber;
    }

    public void setMaxPassengerNumber(int maxPassengerNumber) {
        this.maxPassengerNumber = maxPassengerNumber;
    }

    public String getCarType() {
        return "This is a passenger car";
    }
}
