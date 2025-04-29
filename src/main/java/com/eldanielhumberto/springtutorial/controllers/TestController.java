package com.eldanielhumberto.springtutorial.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eldanielhumberto.springtutorial.models.Student;

@Controller
public class TestController {
    @GetMapping("/")
    public String helloWorld(Model model) {
        Student student = new Student("Humberto Daniel", 2);
        model.addAttribute("student", student);

        return "hello-world";
    }
}
