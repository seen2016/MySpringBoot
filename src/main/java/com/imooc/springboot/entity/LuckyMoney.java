package com.imooc.springboot.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import java.math.BigDecimal;

/**
 * Created by seen on 2020/1/1.
 */
@Entity
public class LuckyMoney {
    @Id
    @GeneratedValue
    private Integer id;
    @Min(message = "不能超过500",value =1)
    private BigDecimal money;
    private String producer;
    private String consumer;


    public LuckyMoney() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }
}
