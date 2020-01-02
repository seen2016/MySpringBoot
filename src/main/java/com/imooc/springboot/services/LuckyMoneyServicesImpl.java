package com.imooc.springboot.services;

import com.imooc.springboot.entity.LuckyMoney;
import com.imooc.springboot.repositorys.LimitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.math.BigDecimal;
import java.util.List;

/**
 * Created by seen on 2020/1/1.
 */
@Service
public class LuckyMoneyServicesImpl {
    @Autowired
    LimitRepository limitRepository;


    @Transactional
    public List<LuckyMoney> findAll() {

        return  limitRepository.findAll();
    }

    @Transactional
    public void save(LuckyMoney luckyMoney) {
        limitRepository.save(luckyMoney);
    }

    @Transactional
    public void save() {
        LuckyMoney luckyMoney = new LuckyMoney();
        luckyMoney.setConsumer("seen");
        luckyMoney.setProducer("我");
        luckyMoney.setMoney(new BigDecimal("520"));
        limitRepository.save(luckyMoney);

        LuckyMoney luckyMoney2 = new LuckyMoney();
        luckyMoney2.setConsumer("我");
        luckyMoney2.setProducer("seen");
        luckyMoney2.setMoney(new BigDecimal("13142"));
        limitRepository.save(luckyMoney2);
    }


}
