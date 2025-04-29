package com.eldanielhumberto.springtutorial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eldanielhumberto.springtutorial.models.Student;
import com.eldanielhumberto.springtutorial.models.dto.StudentDTO;

@Controller
public class TestController {
    @GetMapping("/")
    public String helloWorld(Model model) {
        Student student = new Student("Humberto", "Ramirez", 2);
        StudentDTO studentDTO = new StudentDTO(student.getName() + " " + student.getLastName());
        model.addAttribute("studentFullName", studentDTO.getFullname());

        return "hello-world";
    }
}
