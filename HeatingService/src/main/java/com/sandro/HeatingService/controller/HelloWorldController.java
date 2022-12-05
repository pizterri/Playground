package com.sandro.HeatingService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/start")
    public String sayHello() {
        return "Hello";
    }
}

