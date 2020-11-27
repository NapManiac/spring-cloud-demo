package com.fly.feign;

import com.fly.config.FeignConfig;
import com.fly.feign.hystrix.HelloHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hello-service", configuration = FeignConfig.class, fallback = HelloHystrix.class)
public interface HelloFeign {

    @GetMapping("/hello-service/hello")
    String sayHelloFromClientEureka(@RequestParam(value = "name") String name);
}
