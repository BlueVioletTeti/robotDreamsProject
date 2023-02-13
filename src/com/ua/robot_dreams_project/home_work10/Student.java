package com.ua.robot_dreams_project.home_work10;

public class Student {
    private String name;
    private String surname;
    private int groupNumber;
    private int grade;
    private boolean ifPassedCourse;

    public void study() {
        System.out.println(name + " is studying now!");
    }

    public void rest() {
        System.out.println(name + " is resting");
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

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isIfPassedCourse() {
        return ifPassedCourse;
    }

    public void setIfPassedCourse(boolean ifPassedCourse) {
        this.ifPassedCourse = ifPassedCourse;
    }
}
