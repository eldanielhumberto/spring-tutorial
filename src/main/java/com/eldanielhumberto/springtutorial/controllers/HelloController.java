package com.eldanielhumberto.springtutorial.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path = "/api/hello")
public class HelloController {

    @GetMapping()
    public String hello() throws InterruptedException {
        Thread.sleep(500);
        return "Hello World!";
    }

}
