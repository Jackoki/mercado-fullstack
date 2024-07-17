package com.supermarket.project.api.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class CustomerController {

    @GetMapping("/")
    public String teste(){
        return "Hello World";
    }
}