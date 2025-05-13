package com.eldanielhumberto.springtutorial.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.eldanielhumberto.springtutorial.models.User;
import com.eldanielhumberto.springtutorial.utils.JwtUtil;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path = "/api/auth")
public class AuthController {
    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/profile")
    public ResponseEntity<?> profile(Authentication authentication) {
        return ResponseEntity.ok(authentication.getPrincipal());
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User userDetails) {
        String token = jwtUtil.generateToken(userDetails.getUsername());
        return ResponseEntity.ok(Map.of("token", token));
    }

}
