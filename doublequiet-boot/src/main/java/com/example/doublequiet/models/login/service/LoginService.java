package com.example.doublequiet.models.login.service;

import com.example.doublequiet.common.entity.Result;
import com.example.doublequiet.models.login.entity.LoginData;

/**
 * Desc: 登录服务层接口
 * author: 谭静
 * date: 2020/3/26
 */
public interface LoginService {
    Result<LoginData> login(LoginData loginData);
    Result<LoginData> register(LoginData loginData);
    Result<LoginData> forgetPassword(LoginData loginData);
}
