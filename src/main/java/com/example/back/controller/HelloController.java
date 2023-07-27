package com.example.back.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/")
    public String come() {
        return "welcome!!";
    }

    @GetMapping("/api/hello")
    public String hello() {
        log.info("################################# hello #########################");
        return "hello";
    }

    @GetMapping("/api/bye")
    public String bye() {
        return "bye";
    }

}
