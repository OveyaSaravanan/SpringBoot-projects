package com.oveya_sample.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Assign a unique path for this method
    @GetMapping("/path")
    public String requestMethodName(@RequestParam String param) {
        return "Received parameter: " + param;
    }

    // Retain the "/hello" mapping for this method
    @GetMapping("/hello")
    public String hello() {
        return "Hello world";
    }
}
