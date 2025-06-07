package com.eldanielhumberto.springtutorial.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eldanielhumberto.springtutorial.services.FileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(path = "/api/file")
public class FileController {
    @Autowired
    private FileService fileService;

    @GetMapping("/read")
    public ResponseEntity<String> read(@RequestParam(name = "file_url") String fileUrl) {
        try {
            String fileString = fileService.readFile(fileUrl);
            return ResponseEntity.ok(fileString);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

}
