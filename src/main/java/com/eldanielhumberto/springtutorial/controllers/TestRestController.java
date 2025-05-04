package com.eldanielhumberto.springtutorial.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

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
@RequestMapping("/api/test-rest")
public class TestRestController {

    private StudentService studentService = new StudentService();

    @Value("${config.code}")
    private int code;

    @Value("${config.messages}")
    private String[] messages;

    @GetMapping("/get")
    public ResponseEntity<?> getTest(@RequestParam(required = false) String fullname) {
        if (fullname != null) {
            try {
                return ResponseEntity.ok(studentService.search(fullname));
            } catch (NoSuchElementException e) {
                return ResponseEntity.ofNullable("Not found");
            }
        }

        return ResponseEntity.ok(studentService.findAll());
    }

    @GetMapping("/@values")
    public Map<String, Object> getValuesProperties() {
        Map<String, Object> res = new HashMap<>();
        res.put("code", code);
        res.put("messages", messages);

        return res; // output: { code: 1234, messages: ["Hola", "que onda", "si"] }
    }

    @GetMapping("/{fullname}")
    public StudentDTO getPathVariableTest(@PathVariable String fullname,
            @RequestParam(required = false) Integer schoolYear) {
        return new StudentDTO(fullname, schoolYear);
    }

    @PostMapping("/post")
    public Object postTest(@Valid @RequestBody Student student, BindingResult result) {
        if (result.hasErrors()) {
            return result.getAllErrors();
        }

        return student;
    }
}
