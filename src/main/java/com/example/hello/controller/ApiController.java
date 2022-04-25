package com.example.hello.controller;

import com.example.hello.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController //해당 class 는 REST API 처리하는 Controller
@RequestMapping("/api")// RequestMapping URI를 지정해주는 Annotation
public class ApiController {


    //TEXT
    @GetMapping("/text")
    public String text(@RequestParam String account){
        return account;
    }

    //JSON
    //req -> object mapper -> object -> method -> object -> object mapper -> json -> response
    @PostMapping("/json")
    public User json(@RequestBody User user){
        System.out.println(user.toString());
        return user;
    }


}
