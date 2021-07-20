package com.xxx.proj.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xxx.proj.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "我是XXX";
    }
}
