package com.kirusanthan.OAuth.security.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/api")
    public String hello(){
        return "Hello from Secure Endpoint";
    }
}
