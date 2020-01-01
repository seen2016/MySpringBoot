package com.imooc.springboot.controller;

import com.imooc.springboot.LimitConfig;
import com.imooc.springboot.services.LuckyMoneyServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public String say(@PathVariable(value = "id") int myid){

        return "springboot 的学习之旅$"+myid;
    }



    @GetMapping(value = "/say2")
    public String say2(@RequestParam(value = "id",required = false,defaultValue = "1") int myid){

        return "springboot 的学习之旅$"+myid;
    }
}
