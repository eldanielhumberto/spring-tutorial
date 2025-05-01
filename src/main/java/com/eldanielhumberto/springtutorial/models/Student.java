package com.eldanielhumberto.springtutorial.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Student {
    @Size(min = 3, max = 20)
    private String name;

    @NotNull
    private Integer schoolYear;

    public Student(String name, String lastName, Integer schoolYear) {
        this.name = name;
        this.schoolYear = schoolYear;
    }

    public String getName() {
        return name;
    }

    public Integer getSchoolYear() {
        return schoolYear;
    }
}
