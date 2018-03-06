package com.example.demo.service.impl;

import com.example.demo.feign.ProviderFeignClient;
import com.example.demo.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService {

    public static final Logger LOG = LoggerFactory.getLogger(IndexServiceImpl.class);

    @Autowired
    private ProviderFeignClient providerFeignClient;

    @Override
    public String add(String a, String b) {
        LOG.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> IndexServiceImpl execute");
        return providerFeignClient.add(a, b);
        //return "11111";
    }
}
