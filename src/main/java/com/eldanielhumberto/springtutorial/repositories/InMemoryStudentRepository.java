package com.eldanielhumberto.springtutorial.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.eldanielhumberto.springtutorial.models.Student;

@Component
public class InMemoryStudentRepository implements StudentRepository {
    List<Student> students;

    public InMemoryStudentRepository() {
        this.students = Arrays.asList(
                new Student("Humberto", 2),
                new Student("Jose", 2),
                new Student("Migue", 2));
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public Student search(String name) {
        return students.stream().filter(s -> s.getName().equals(name)).findFirst().orElseThrow();
    }
}
