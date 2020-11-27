package com.fly.service;

import com.fly.feign.ByeFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ByeService {
    @Autowired
    private ByeFeign byeFeign;

    public String sayBye(String name) {
        return byeFeign.sayByeFromClientEureka(name);
    }
}
