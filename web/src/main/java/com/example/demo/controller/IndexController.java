package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.cr.core.vo.UserVO;
import com.example.demo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping(value = "/index")
    public String index() {
        UserVO userVO = new UserVO();
        userVO.setName("张三");
        userVO.setAge(18);
        userVO.setSex(1);
        userVO.setBirthDay(new Date());
        return JSON.toJSONString(userVO);
    }

    @RequestMapping(value = "/add")
    public String add(String a, String b) {
        return indexService.add(a, b);
    }

}
