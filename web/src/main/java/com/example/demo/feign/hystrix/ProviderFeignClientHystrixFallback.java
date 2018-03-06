package com.example.demo.feign.hystrix;

import com.example.demo.feign.ProviderFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ProviderFeignClientHystrixFallback implements ProviderFeignClient {
    public static final Logger LOG = LoggerFactory.getLogger(ProviderFeignClientHystrixFallback.class);

    @Override
    public String add(String a, String b) {
        LOG.error(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>ProviderFeignClient.add({},{}) connected timeout!", a, b);
        return "Connect timeout!";
    }
}
