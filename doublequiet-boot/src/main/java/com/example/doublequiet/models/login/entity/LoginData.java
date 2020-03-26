package com.example.doublequiet.models.login.entity;

import lombok.Data;
import lombok.ToString;

/**
 * Desc: 登录实体类
 * author: 谭静
 * date: 2020/3/26
 */
@Data
@ToString
public class LoginData {
    private String id;
    private String username;
    private String password;
    private String identity;//身份
    private String name;
    private String sex;
    private String age;
    private String birthday;
    private String phone;
    private String email;
}
