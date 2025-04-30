package com.eldanielhumberto.springtutorial.models.dto;

public class StudentDTO {
    private String fullname;
    private Integer schoolYear;

    public StudentDTO(String fullname, Integer schoolYear) {
        this.fullname = fullname;
        this.schoolYear = schoolYear;
    }

    public String getFullname() {
        return fullname;
    }

    public Integer getSchoolYear() {
        return schoolYear;
    }
}
