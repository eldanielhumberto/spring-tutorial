package com.eldanielhumberto.springtutorial.models;

public class Student {
    private String name, lastName;
    private int schoolYear;

    public Student(String name, String lastName, int schoolYear) {
        this.name = name;
        this.lastName = lastName;
        this.schoolYear = schoolYear;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSchoolYear() {
        return schoolYear;
    }
}
