package com.cr.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(value = "/add", method = {RequestMethod.GET})
    public String add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        return String.valueOf(a + b);
    }
}
