package com.eldanielhumberto.springtutorial.models.dto;

public class StudentDTO {
    private String fullname;

    public StudentDTO(String fullname) {
        this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }
}
