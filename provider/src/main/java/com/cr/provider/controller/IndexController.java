package com.cr.provider.controller;

import com.cr.core.common.ResultType;
import com.cr.provider.model.User;
import com.cr.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = {RequestMethod.GET})
    public Map<String, Object> add(@RequestParam("a") String a, @RequestParam("b") String b) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>IndexController execute");
        User user = new User();
        user.setAccount("yaogang");
        user.setPassword("yaogang");
        user.setAge(1);
        user.setSex(2);
        this.userService.add(user);
        return ResultType.getSuccessMap(this.userService.selectAll());
    }

}
