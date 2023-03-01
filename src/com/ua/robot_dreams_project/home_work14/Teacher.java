package com.ua.robot_dreams_project.home_work14;

public class Teacher extends Human {
    private String courseTitle;
    private int numberOfGroupsTaught;

    public Teacher() {
    }

    public Teacher(int id, String name, String surname, String occupationType) {
        super(id, name, surname, occupationType);
    }

    public Teacher(String courseTitle, int numberOfGroupsTaught) {
        this.courseTitle = courseTitle;
        this.numberOfGroupsTaught = numberOfGroupsTaught;
    }

    public void teach() {
        System.out.println("The lesson has started already. Professor " + super.getSurname() + " is teaching " + courseTitle + " now");
    }

    public void dismissClass() {
        System.out.println("The class is over");
    }

    @Override
    public String makeMoney() {
        teach();
        dismissClass();
        return null;
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
