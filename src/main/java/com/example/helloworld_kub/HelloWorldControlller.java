package com.example.helloworld_kub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControlller {
    @GetMapping("/get-hello")
    public String getHello() {
        return "Hello Vedant";
    }
}
