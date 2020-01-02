package com.imooc.springboot.handler;

import com.imooc.springboot.entity.HttpResult;
import com.imooc.springboot.exceptions.LuckyMoneyException;
import com.imooc.springboot.utils.ResultUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2020/1/2.
 */
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler
    @ResponseBody
    private HttpResult handler(Exception e) {
        if (e instanceof LuckyMoneyException) {
            LuckyMoneyException luckyMoneyException = (LuckyMoneyException) e;
            return ResultUtils.error(luckyMoneyException.getCode(), luckyMoneyException.getMessage());
        }
        return ResultUtils.error(-1, "未知错误");
    }


}
