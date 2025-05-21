package com.eldanielhumberto.springtutorial.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path = "/api/operations")
public class OperationsController {
    @GetMapping
    public String division() {
        int value = 20 / 0;
        return "Result: " + value;
    }
}
