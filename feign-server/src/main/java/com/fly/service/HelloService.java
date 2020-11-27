package com.fly.service;

import com.fly.feign.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Autowired
    private HelloFeign helloFeign;

    public String sayHello(String name) {
        return helloFeign.sayHelloFromClientEureka(name);
    }


}
