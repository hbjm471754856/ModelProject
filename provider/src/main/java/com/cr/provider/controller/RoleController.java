package com.cr.provider.controller;

import com.cr.provider.service.RoleService;
import com.cr.core.common.ResultType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/mapping", method = {RequestMethod.GET})
    public Map<String, Object> methedName(@RequestParam("a") String a) throws Exception {
        return ResultType.getSuccessMap(null);
    }

}