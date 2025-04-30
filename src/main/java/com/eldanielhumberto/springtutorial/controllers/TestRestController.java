package com.eldanielhumberto.springtutorial.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// import com.eldanielhumberto.springtutorial.models.Student;
import com.eldanielhumberto.springtutorial.models.dto.StudentDTO;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/test-rest")
public class TestRestController {

    @GetMapping("/get")
    public StudentDTO getTest(@RequestParam(required = false) String fullname) {
        return new StudentDTO(fullname);
    }

    @GetMapping("/get/{fullname}")
    public StudentDTO getPathVariableTest(@PathVariable String fullname) {
        return new StudentDTO(fullname);
    }

    @RequestMapping(path = "/post", method = RequestMethod.POST)
    public Map<String, Object> postTest() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Hello post");

        return response;
    }

}
