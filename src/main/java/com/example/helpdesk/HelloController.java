package com.example.helpdesk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello, World!"; // http://localhost:8080
    }

    @GetMapping("/status")
    public String status() {
        return "Application is running"; // http://localhost:8080/status
    }
}