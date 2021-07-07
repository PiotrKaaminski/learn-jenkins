package com.example.learnjenkins;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${profile.response}")
    private String response;

    @GetMapping("/")
    public String hello() {
        return "Hello from " + response + " profile at main branch";
    }

}
