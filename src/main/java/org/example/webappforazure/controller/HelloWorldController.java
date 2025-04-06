package org.example.webappforazure.controller;

import org.example.webappforazure.dto.Settings;
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
    public ResponseEntity<Settings> sayHello(@PathVariable String name) {
        Settings settings = new Settings();
        settings.setName(name);
        settings.setPassword(System.getenv("SecretPassword"));
        return new ResponseEntity<>(settings, HttpStatus.OK);
    }
}
