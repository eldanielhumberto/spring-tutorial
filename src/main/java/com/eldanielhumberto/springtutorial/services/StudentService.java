package com.eldanielhumberto.springtutorial.services;

import java.util.List;

import com.eldanielhumberto.springtutorial.models.Student;

public interface StudentService {
    List<Student> findAll();

    Student search(String name);
}
