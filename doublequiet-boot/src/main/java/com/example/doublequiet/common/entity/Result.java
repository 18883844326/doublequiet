package com.example.doublequiet.common.entity;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * Desc:
 * author: 谭静
 * date: 2020/3/26
 */
@Data
@ToString
public class Result<T> {
    private int code;
    private String message;
    private boolean success;
    private T data;

    public static Result ok() {
        Result result = new Result();
        result.setCode(200);
        result.setMessage("成功");
        result.setSuccess(true);
        return result;
    }

    public static Result error() {
        Result result = new Result();
        result.setCode(500);
        result.setMessage("请求异常");
        result.setSuccess(true);
        return result;
    }

    public static Result error(String message) {
        Result result = new Result();
        result.setCode(500);
        result.setMessage(message);
        result.setSuccess(false);
        return result;
    }
}
