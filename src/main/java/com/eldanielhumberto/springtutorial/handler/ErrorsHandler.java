package com.eldanielhumberto.springtutorial.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorsHandler {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> handlerArithmeticException(ArithmeticException e) {
        return new ResponseEntity<>("Arithmetic exception", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<String> handlerNumberFormatException(NumberFormatException e) {
        return new ResponseEntity<>("Invalid numbers", HttpStatus.BAD_REQUEST);
    }

}
