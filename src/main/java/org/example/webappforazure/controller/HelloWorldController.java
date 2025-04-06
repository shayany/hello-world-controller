package org.example.webappforazure.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class HelloWorldController {


    @GetMapping("/hello/{name}")
    public ResponseEntity<String> sayHello(@PathVariable String name) {
        return new ResponseEntity<String>("Hello, " + name + " (STM)!", HttpStatus.OK);
    }
}
