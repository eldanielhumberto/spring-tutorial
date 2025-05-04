package com.eldanielhumberto.springtutorial.services;

import java.util.List;

import com.eldanielhumberto.springtutorial.models.Student;
import com.eldanielhumberto.springtutorial.repositories.StudentRepository;

public class StudentService {
    private StudentRepository repository = new StudentRepository();

    public List<Student> findAll() {
        return repository.findAll();
    }

    public Student search(String name) {
        return repository.searchStudent(name);
    }

}
