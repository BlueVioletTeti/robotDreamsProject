package com.ua.robot_dreams_project.home_work11;

public class Car {
    private String model;
    private String carType;
    private String color;
    private int horsepower;

    public Car() {
    }

    public Car(String model, String carType, String color, int horsepower) {
        this.model = model;
        this.carType = carType;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarType() {
        return "This is a car";
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void drive() {
        System.out.println("Drive");
    }
}
