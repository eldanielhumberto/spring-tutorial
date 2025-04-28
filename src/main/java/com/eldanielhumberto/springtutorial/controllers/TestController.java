package com.eldanielhumberto.springtutorial.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/hello-world")
    public String helloWorld(Map<String, Object> model) {
        model.put("Message", "Hello world");

        return "hello-world";
    }
}
