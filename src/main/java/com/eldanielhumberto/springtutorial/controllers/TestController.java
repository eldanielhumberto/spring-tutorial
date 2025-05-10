package com.eldanielhumberto.springtutorial.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.eldanielhumberto.springtutorial.models.Student;
import com.eldanielhumberto.springtutorial.models.dto.StudentDTO;

@Controller
public class TestController {
    @GetMapping("/")
    public String helloWorld() {
        return "hello-world";
    }

}
