package com.imooc.springboot.utils;

import com.imooc.springboot.entity.HttpResult;

/**
 * Created by Administrator on 2020/1/2.
 */
public class ResultUtils {
    public static HttpResult success(Object object){
        HttpResult httpResult = new HttpResult();
        httpResult.setCode(0);
        httpResult.setMessage("成功");
        httpResult.setData(object);
        return httpResult;
    }

    /**
     * 成功不返回data
     * @return
     */
     public static HttpResult success(){
        HttpResult httpResult = new HttpResult<>();
        httpResult.setCode(0);
        httpResult.setMessage("成功");
        httpResult.setData("");
        return httpResult;
    }


    /**
     * 成功不返回data
     * @return
     */
    public static HttpResult error(Integer code,String message){
        HttpResult httpResult = new HttpResult<>();
        httpResult.setCode(code);
        httpResult.setMessage(message);
        httpResult.setData("");
        return httpResult;
    }

}
