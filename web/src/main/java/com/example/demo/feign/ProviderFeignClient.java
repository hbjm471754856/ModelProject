package com.example.demo.feign;

import com.example.demo.feign.hystrix.ProviderFeignClientHystrixFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "provider", fallback = ProviderFeignClientHystrixFallback.class)
public interface ProviderFeignClient {

    @RequestMapping(value = "/add", method = {RequestMethod.GET})
    public String add(@RequestParam("a") String a, @RequestParam("b") String b);
}
