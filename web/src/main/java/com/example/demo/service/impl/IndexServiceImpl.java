package com.example.demo.service.impl;

import com.example.demo.feign.ProviderFeignClient;
import com.example.demo.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class IndexServiceImpl implements IndexService {

    public static final Logger LOG = LoggerFactory.getLogger(IndexServiceImpl.class);

    @Resource
    private ProviderFeignClient providerFeignClient;

    @Override
    public String add(Integer a, Integer b) {
        LOG.info("IndexServiceImpl execute");
        return providerFeignClient.add(a, b);
    }
}
