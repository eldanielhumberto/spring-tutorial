package com.eldanielhumberto.springtutorial.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorsHandler {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> handlerArithmeticException(ArithmeticException e) {
        return new ResponseEntity<>("Arithmetic Exception", HttpStatus.BAD_REQUEST);
    }

}
