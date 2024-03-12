package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class CustomerController {

    @GetMapping("/index")
    public String index(){

        return "hello world";
    }

    @GetMapping("/index2")
    public String index2(){

        return "hello world Not SECURED!!";
    }
}
