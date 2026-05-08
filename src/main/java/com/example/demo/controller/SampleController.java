package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class SampleController {
    @GetMapping("/get")
    public String sample(){
        return "Hello World";
    }
}
