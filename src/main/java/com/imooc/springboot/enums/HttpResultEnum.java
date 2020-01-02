package com.imooc.springboot.enums;

/**
 * Created by Administrator on 2020/1/2.
 */
public enum  HttpResultEnum {
    UNKONW_ERROE(-1,"未知错误"),
    SUCCESS(0,"成功"),
    PRIMARY_SCHOOL(100,"你还在上小学吧"),

    ;
    private Integer code;
    private String message;

    HttpResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
