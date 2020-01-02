package com.imooc.springboot.services;

import com.imooc.springboot.entity.LuckyMoney;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2020/1/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LuckyMoneyServicesImplTest {
    @Autowired
    LuckyMoneyServicesImpl services;

    @Test
    public void findAll() throws Exception {

        List<LuckyMoney> all = services.findAll();
        for (LuckyMoney bean:
             all) {
            System.out.println(bean.getMoney());
        }
    }

    @Test
    public void save() throws Exception {
        List<LuckyMoney> all = services.findAll();
        for (LuckyMoney bean:
                all) {
            System.out.println(bean.getMoney());
        }
    }

    @Test
    public void save1() throws Exception {
    }

}