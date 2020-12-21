package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class entrance {
    @PostMapping("/upload")
    String getMessage(@RequestBody String json){
        System.out.println(json);
        return "ok";
    }
}
