package com.example.smart_city.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {

    @GetMapping("/public/hello")
    public String publicEndpoint() {
        return "Hello, Public API!";
    }

    @GetMapping("/private/hello")
    public String privateEndpoint() {
        return "Hello, Secured API!";
    }

    @GetMapping("/admin/hello")
    public String adminEndpoint() {
        return "Hello, Admin API!";
    }
}

