package com.imooc.springboot.repositorys;

import com.imooc.springboot.LimitConfig;
import com.imooc.springboot.entity.LuckyMoney;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by seen on 2020/1/1.
 */
public interface LimitRepository extends JpaRepository<LuckyMoney,Integer> {
//    void getAllByName();
}
