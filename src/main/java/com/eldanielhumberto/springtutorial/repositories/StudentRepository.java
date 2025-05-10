package com.eldanielhumberto.springtutorial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eldanielhumberto.springtutorial.models.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
