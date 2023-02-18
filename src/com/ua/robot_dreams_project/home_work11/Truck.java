package com.ua.robot_dreams_project.home_work11;

public class Truck extends Car {
    private int maxCargoWeight;

    public Truck() {
    }

    public Truck(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    public Truck(String model, String carType, String color, int horsepower, int maxCargoWeight) {
        super(model, carType, color, horsepower);
        this.maxCargoWeight = maxCargoWeight;
    }

    public int getMaxCargoWeight() {
        return maxCargoWeight;
    }

    public void setMaxCargoWeight(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    public String getCarType() {
        return "This is a truck";
    }
}
