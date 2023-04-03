package com.ua.robot_dreams_project.home_work21;

public class Student {
    String surname;
    int averageGrade;

    public Student() {
    }

    public Student(String surname, int averageGrade) {
        this.surname = surname;
        this.averageGrade = averageGrade;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(int averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
