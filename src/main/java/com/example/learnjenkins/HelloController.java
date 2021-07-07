package com.example.learnjenkins;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${release.response}")
    private String release;
    @Value("${prod.response}")
    private String prod;
    @Value("${dev.response}")
    private String dev;

    @GetMapping("/")
    public String hello() {
        String message = "|";
        if (!release.startsWith("@")) {
            message += release + " ";
        }
        if (!prod.startsWith("@")) {
            message += prod + " ";
        }
        if (!dev.startsWith("@")) {
            message += dev + " ";
        }
        message += "|";
        return "Hello from " + message + " profile at main branch";
    }

}
