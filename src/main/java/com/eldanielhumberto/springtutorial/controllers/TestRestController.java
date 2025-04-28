package com.eldanielhumberto.springtutorial.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
    @GetMapping("/get-json")
    public Map<String, Object> getJson() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Hello rest controller");

        return response;
    }

}
