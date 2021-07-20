package com.xxx.proj.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xxx.proj.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/user")
public class UserController {
    @Reference
    private UserService service;

    @RequestMapping("showName")
    @ResponseBody
    public String showName() {
        return service.getName();
    }
}
