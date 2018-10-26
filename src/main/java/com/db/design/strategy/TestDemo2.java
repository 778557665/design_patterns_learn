package com.db.design.strategy;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestDemo2 {

    public static void main(String[] args) {

        List<Commodity> commodityList = new ArrayList<>();
        commodityList.add(new Commodity(2,new BigDecimal("2.5")));
        commodityList.add(new Commodity(1,new BigDecimal("3")));
        commodityList.add(new Commodity(1,new BigDecimal("10")));

        BigDecimal count = new BigDecimal("0");
        for (Commodity commodity : commodityList) {
            count = count.add(new BigDecimal(commodity.getCount()).multiply(commodity.getPrice())) ;
            System.out.println("数量："+ commodity.getCount() + "价格：" + commodity.getPrice());
        }
        System.out.println("合计：" + discount(count,new BigDecimal("0.8")));

    }


    //打折方法
    public static BigDecimal discount(BigDecimal count,BigDecimal discount){
        return count.multiply(discount);
    }

    /**
     *
     * @param full 满价格
     * @param reduce 减价格
     * @param count 总计价格
     * @return
     */
    public static BigDecimal fullReduction(BigDecimal full, BigDecimal reduce, BigDecimal count) throws Exception {
        if(count.compareTo(full) < 0){
            throw new Exception("未达到满减价格");
        }
        return count.subtract(reduce);
    }
}


class Commodity{

    private Integer count;

    private BigDecimal price;


    public Commodity(Integer count, BigDecimal price) {
        this.count = count;
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

