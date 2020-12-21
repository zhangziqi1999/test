package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Entrance {
    @PostMapping("/upload")
    String getMessage(@RequestBody JsonEntity jsonEntity){
        System.out.println(jsonEntity);
        System.out.println(jsonEntity.getDataEntity());
        return "ok";
    }
}
