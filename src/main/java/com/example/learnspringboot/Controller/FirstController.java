package com.example.learnspringboot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    //URL -

    @RequestMapping("/")
    public String sayHello() {
        return "Hello";
    }

    @RequestMapping("/hello/world")
    public String helloWorld() {
        return "Hello World !!!!!";
    }

}
