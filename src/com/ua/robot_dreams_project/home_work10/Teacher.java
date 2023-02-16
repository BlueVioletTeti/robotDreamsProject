package com.ua.robot_dreams_project.home_work10;

public class Teacher {
    private String name;
    private String surname;
    private String courseTitle;
    private int numberOfGroupsTaught;

    public void teach() {
        System.out.println("The lesson has started already. Professor " + surname + " is teaching " + courseTitle + " now");
    }

    public void dismissClass() {
        System.out.println("The class is over, you may go now");
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

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getNumberOfGroupsTaught() {
        return numberOfGroupsTaught;
    }

    public void setNumberOfGroupsTaught(int numberOfGroupsTaught) {
        this.numberOfGroupsTaught = numberOfGroupsTaught;
    }
}
