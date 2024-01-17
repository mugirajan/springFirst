package com.springboot.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/api/gr/{name}")
    public String greet(@PathVariable String name) {
        System.out.println("Received parameter: " + name);
        return "Hello, " + name + "!";
    }
}
 