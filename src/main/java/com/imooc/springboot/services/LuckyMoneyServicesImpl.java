package com.imooc.springboot.services;

import com.imooc.springboot.repositorys.LimitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by seen on 2020/1/1.
 */
@Service
public class LuckyMoneyServicesImpl implements LuckyMoneyServices {
    @Autowired
    LimitRepository limitRepository;


    @Override
    public void findAll() {

    }
}
