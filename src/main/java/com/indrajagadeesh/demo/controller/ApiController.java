package com.indrajagadeesh.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/")
    public String index() {
        return "<h1> Hello Medium ....!</h1><br>";
    }

    @GetMapping("/{name}")
    public String hello(@PathVariable String name) {
        return "<h2> Hello "+name+" ....!</h2>";
    }
}
