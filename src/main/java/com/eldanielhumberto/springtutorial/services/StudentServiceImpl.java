package com.eldanielhumberto.springtutorial.services;

import java.util.List;

import com.eldanielhumberto.springtutorial.models.Student;
import com.eldanielhumberto.springtutorial.repositories.InMemoryStudentRepository;

public class StudentServiceImpl implements StudentService {
    private InMemoryStudentRepository repository = new InMemoryStudentRepository();

    @Override
    public List<Student> findAll() {
        return repository.findAll();
    }

    @Override
    public Student search(String name) {
        return repository.search(name);
    }

}
