package com.fly.feign;

import com.fly.config.FeignConfig;
import com.fly.feign.hystrix.ByeHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "bye-service", configuration = FeignConfig.class, fallback = ByeHystrix.class)
public interface ByeFeign {
    @GetMapping("/bye-service/bye")
    String sayByeFromClientEureka(@RequestParam(value = "name") String name);
}
