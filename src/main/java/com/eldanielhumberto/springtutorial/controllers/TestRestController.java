package com.eldanielhumberto.springtutorial.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api/test-rest")
public class TestRestController {

    @GetMapping("/get")
    public Map<String, Object> getMap() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Hello get");

        return response;
    }

    @RequestMapping(path = "/post", method = RequestMethod.POST)
    public Map<String, Object> postMap() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Hello post");

        return response;
    }

}
