package com.eldanielhumberto.springtutorial.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path = "/api/operations")
public class OperationsController {
    @GetMapping
    public String division(@RequestParam(name = "numerator") String numeratorString,
            @RequestParam(name = "denominator") String denominatorString) {
        try {
            int numerator = Integer.parseInt(numeratorString);
            int denominator = Integer.parseInt(denominatorString);
            int result = numerator / denominator;

            return "Resultado: " + result;
        } catch (ArithmeticException e) {
            throw e;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    @GetMapping("/null-value")
    public String nullString() {
        String nullValue = null;

        return "Lenght string: " + nullValue.length();
    }
}