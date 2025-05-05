package com.eldanielhumberto.springtutorial.repositories;

import java.util.List;

import com.eldanielhumberto.springtutorial.models.Student;

public interface StudentRepository {
    List<Student> findAll();

    Student search(String name);
}
