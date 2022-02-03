package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class homeController {

    @GetMapping(value = "/")
    public String home() {

        return "HOME";
    }

    @GetMapping(value = "/home")
    public String home1() {

        return "HOME 1";
    }
}
