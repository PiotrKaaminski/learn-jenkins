package com.example.learnjenkins;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        for (Map.Entry<String, String> entry : map.entrySet()) {

        }
        return "Hello from " + message + " profile at main branch";
    }

}
