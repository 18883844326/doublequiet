package com.example.doublequiet.models.login.controller;

import com.example.doublequiet.common.entity.Result;
import com.example.doublequiet.models.login.entity.LoginData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc: 登录模块控制层
 * author: 谭静
 * date: 2020/3/26
 */
@Slf4j
@RestController
public class LoginController {
    @RequestMapping("/login")
    public Result<LoginData> login(@RequestBody LoginData login) {
        return Result.ok();
    }

    @RequestMapping("/register")
    public Result<LoginData> register(@RequestBody LoginData register) {
        return Result.ok();
    }

    @RequestMapping("/forget")
    public Result<LoginData> forgetPassword(@RequestBody LoginData login) {
        return Result.ok();
    }
}
