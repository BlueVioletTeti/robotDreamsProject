package com.ua.robot_dreams_project.home_work14;

public abstract class Human {
    private int id;
    private String name;
    private String surname;
    private String occupationType;

    public Human() {
    }

    public Human(int id, String name, String surname, String occupationType) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.occupationType = occupationType;
    }

    public abstract String makeMoney();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOccupationType() {
        return occupationType;
    }

    public void setOccupationType(String occupationType) {
        this.occupationType = occupationType;
    }
}
