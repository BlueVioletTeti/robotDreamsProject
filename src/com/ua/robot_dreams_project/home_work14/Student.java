package com.ua.robot_dreams_project.home_work14;

public class Student extends Human {
    private int groupNumber;
    private int grade;
    private boolean ifPassedCourse;

    public Student() {
    }

    public Student(int id, String name, String surname, String occupationType) {
        super(id, name, surname, occupationType);
    }

    public Student(int groupNumber, int grade, boolean ifPassedCourse) {
        this.groupNumber = groupNumber;
        this.grade = grade;
        this.ifPassedCourse = ifPassedCourse;
    }

    public void study() {
        System.out.println(super.getName() + " is studying now");
    }

    public void rest() {
        System.out.println(super.getName() + " is resting");
    }

    @Override
    public String makeMoney() {
        study();
        rest();
        return null;
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
