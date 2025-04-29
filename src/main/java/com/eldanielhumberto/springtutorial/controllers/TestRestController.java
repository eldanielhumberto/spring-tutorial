package com.eldanielhumberto.springtutorial.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eldanielhumberto.springtutorial.models.Student;
import com.eldanielhumberto.springtutorial.models.dto.StudentDTO;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api/test-rest")
public class TestRestController {

    @GetMapping("/get")
    public StudentDTO getMap() {

        // Using models and DTO
        Student student = new Student("Humberto", "Ramirez", 2);
        StudentDTO studentDTO = new StudentDTO(student.getName() + " " + student.getLastName());

        return studentDTO;
    }

    @RequestMapping(path = "/post", method = RequestMethod.POST)
    public Map<String, Object> postMap() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Hello post");

        return response;
    }

}
