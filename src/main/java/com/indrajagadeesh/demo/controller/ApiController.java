package com.indrajagadeesh.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class ApiController {

    @GetMapping("/")
    public String index() {
        log.info("hit successful");
        return "<h1> Hello Medium ....!</h1><br>";
    }

    @GetMapping("/{name}")
    public String hello(@PathVariable String name) {
        log.info("hit successful and message is {}",name);
        return "<h2> Hello "+name+" ....!</h2>";
    }
}
