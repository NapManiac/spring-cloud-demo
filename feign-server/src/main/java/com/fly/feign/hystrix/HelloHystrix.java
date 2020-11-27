package com.fly.feign.hystrix;

import com.fly.feign.HelloFeign;
import org.springframework.stereotype.Component;

@Component
public class HelloHystrix implements HelloFeign {
    @Override
    public String sayHelloFromClientEureka(String name) {
        return "hello, " + name + "sorry, error";
    }
}
