package com.eldanielhumberto.springtutorial.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eldanielhumberto.springtutorial.models.Student;
import com.eldanielhumberto.springtutorial.models.dto.StudentDTO;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/test-rest")
public class TestRestController {

    @GetMapping("/get")
    public StudentDTO getTest(@RequestParam(required = false) String fullname,
            @RequestParam(required = false) Integer schoolYear) {
        return new StudentDTO(fullname, schoolYear);
    }

    @GetMapping("/{fullname}")
    public StudentDTO getPathVariableTest(@PathVariable String fullname,
            @RequestParam(required = false) Integer schoolYear) {
        return new StudentDTO(fullname, schoolYear);
    }

    @PostMapping("/post")
    public Student postTest(@RequestBody Student entity) {
        return entity;
    }
}
