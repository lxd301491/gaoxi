package com.example.gaoxicontroller.controller;

import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;
import java.util.Map;

public interface UserContoller {
    Result login(Map<String, Object> loginReq, HttpServletResponse httpRsp);
}
