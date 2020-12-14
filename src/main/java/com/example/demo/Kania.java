package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Kania {

    @GetMapping("/kania")
    public String kania(){
        return "kania123";
    }
}
