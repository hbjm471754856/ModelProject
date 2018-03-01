package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.cr.core.vo.UserVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class IndexController {

    @RequestMapping(value = "/index")
    public String index() {
        UserVO userVO = new UserVO();
        userVO.setName("张三");
        userVO.setAge(18);
        userVO.setSex(1);
        userVO.setBirthDay(new Date());
        return JSON.toJSONString(userVO);
    }

}
