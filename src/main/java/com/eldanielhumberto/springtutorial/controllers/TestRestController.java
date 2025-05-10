package com.eldanielhumberto.springtutorial.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eldanielhumberto.springtutorial.models.Student;
import com.eldanielhumberto.springtutorial.models.dto.StudentDTO;
import com.eldanielhumberto.springtutorial.services.StudentService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/students")
public class TestRestController {

    @Autowired
    private StudentService studentService;

    @Value("${config.code}")
    private int code;

    @Value("${config.messages}")
    private String[] messages;

    @GetMapping
    public ResponseEntity<?> getTest() {
        return ResponseEntity.ok(studentService.findAll());
    }

    @PostMapping
    public ResponseEntity<Student> postTest(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.save(student));
    }

    @GetMapping("/@values")
    public Map<String, Object> getValuesProperties() {
        Map<String, Object> res = new HashMap<>();
        res.put("code", code);
        res.put("messages", messages);

        return res; // output: { code: 1234, messages: ["Hola", "que onda", "si"] }
    }
}
