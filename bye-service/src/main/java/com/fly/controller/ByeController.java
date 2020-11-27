package com.fly.controller;

import brave.Tracer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bye-service")
public class ByeController {
    @Autowired
    Tracer tracer;

    @Value("${server.port}")
    private String port;


    @GetMapping("/bye")
    public String home(@RequestParam String name) {
        tracer.currentSpan().tag("name", name);
        return "bye, " + name + ":" + port;
    }
}
