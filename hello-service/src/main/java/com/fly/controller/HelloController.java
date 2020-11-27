package com.fly.controller;

import brave.Tracer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-service")
public class HelloController {

    @Autowired
    Tracer tracer;

    @Value("${server.port}")
    private String port;


    @GetMapping("/hello")
    public String home(@RequestParam String name) {
        tracer.currentSpan().tag("name", name);
        return "hello, " + name + ":" + port;
    }
}
