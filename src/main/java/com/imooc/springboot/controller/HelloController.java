package com.imooc.springboot.controller;

import com.imooc.springboot.LimitConfig;
import com.imooc.springboot.entity.HttpResult;
import com.imooc.springboot.entity.LuckyMoney;
import com.imooc.springboot.services.LuckyMoneyServicesImpl;
import com.imooc.springboot.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by seen on 2020/1/1.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    /*    @Value("${minMoney}")
        private BigDecimal minMoney;*/
    @Autowired
    private LimitConfig limitConfig;

    @Autowired
    LuckyMoneyServicesImpl services;

    @GetMapping(value = "/say/{id}")
    public String say(@PathVariable(value = "id") int myid) {

        return "springboot 的学习之旅$" + myid;
    }


    @GetMapping(value = "/say2")
    public String say2(@RequestParam(value = "id", required = false, defaultValue = "1") int myid) {

        return "springboot 的学习之旅$" + myid;
    }

    @GetMapping(value = "/save")
    public String saveLucky() {
        services.findAll();
        return "保存成功";
    }


    @PostMapping(value = "/jiaoyan")
    public Object jiaoyan(@Valid LuckyMoney luckyMoney, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtils.error(1,bindingResult.getFieldError().getDefaultMessage());
        }
        services.save(luckyMoney);
        return ResultUtils.success(luckyMoney);
    }


}
