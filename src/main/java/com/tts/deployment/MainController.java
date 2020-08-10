package com.tts.deployment;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MainController {
    
    @GetMapping(value="/")
    public String sayHello() {
        return "hello world";
    }
    
}