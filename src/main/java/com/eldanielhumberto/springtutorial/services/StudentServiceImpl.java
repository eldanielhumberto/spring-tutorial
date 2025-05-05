package com.eldanielhumberto.springtutorial.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eldanielhumberto.springtutorial.models.Student;
import com.eldanielhumberto.springtutorial.repositories.InMemoryStudentRepository;
import com.eldanielhumberto.springtutorial.repositories.StudentRepository;

@Component
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository repository;

    @Override
    public List<Student> findAll() {
        return repository.findAll();
    }

    @Override
    public Student search(String name) {
        return repository.search(name);
    }

}
