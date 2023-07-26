package com.example.back.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/api/bye")
    public String bye() {
        return "bye";
    }

}
