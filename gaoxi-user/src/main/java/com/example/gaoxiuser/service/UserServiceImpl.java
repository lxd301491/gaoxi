package com.example.gaoxiuser.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.example.gaoxicommonservicefacade.service.UserService;

import java.util.Map;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public String login(Map<String, Object> loginReq) {
        return null;
    }
}
