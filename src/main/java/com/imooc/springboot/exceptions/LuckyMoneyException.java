package com.imooc.springboot.exceptions;

import com.imooc.springboot.enums.HttpResultEnum;

/**
 * Created by Administrator on 2020/1/2.
 */
public class LuckyMoneyException extends RuntimeException {
    private Integer code;

    public LuckyMoneyException(HttpResultEnum httpResultEnum) {
        super(httpResultEnum.getMessage());
        this.code = httpResultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }


}
