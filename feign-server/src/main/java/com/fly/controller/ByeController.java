package com.fly.controller;

import com.fly.service.ByeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bye-service")
public class ByeController {
    @Autowired
    private ByeService byeService;

    @GetMapping("/bye")
    public String sayBye(@RequestParam(value = "name", defaultValue = "fly") String name) {
        return byeService.sayBye(name);
    }

}
