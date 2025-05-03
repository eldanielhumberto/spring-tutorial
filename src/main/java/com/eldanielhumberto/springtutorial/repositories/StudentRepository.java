package com.eldanielhumberto.springtutorial.repositories;

import java.util.Arrays;
import java.util.List;

import com.eldanielhumberto.springtutorial.models.Student;

public class StudentRepository {
    List<Student> students;

    public StudentRepository() {
        this.students = Arrays.asList(
                new Student("Humberto", 2),
                new Student("Jose", 2),
                new Student("Migue", 2));
    }

    public List<Student> findAll() {
        return students;
    }

    public Student searchStudent(String name) {
        return students.stream().filter(s -> s.getName().equals(name)).findFirst().orElseThrow();
    }
}
