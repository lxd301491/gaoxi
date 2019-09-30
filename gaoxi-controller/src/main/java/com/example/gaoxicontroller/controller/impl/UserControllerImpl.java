package com.example.gaoxicontroller.controller.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.gaoxicommonservicefacade.service.UserService;
import com.example.gaoxicontroller.controller.UserContoller;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;
import java.util.Map;

@RestController
public class UserControllerImpl implements UserContoller {
    @Reference(version = "1.0.0")
    private UserService userService;

    @Override
    public Result login(Map<String, Object> loginReq, HttpServletResponse httpRsp) {
        String login = userService.login(loginReq);
    }
}
