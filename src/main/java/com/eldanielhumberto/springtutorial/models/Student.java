package com.eldanielhumberto.springtutorial.models;

public class Student {
    private String name;
    private int schoolYear;

    public Student(String name, int schoolYear) {
        this.name = name;
        this.schoolYear = schoolYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;
    }
}
