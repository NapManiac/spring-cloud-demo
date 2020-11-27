package com.fly.feign.hystrix;

import com.fly.feign.ByeFeign;
import org.springframework.stereotype.Component;

@Component
public class ByeHystrix implements ByeFeign {
    @Override
    public String sayByeFromClientEureka(String name) {
        return "bye, " + name + "sorry, error";
    }
}
