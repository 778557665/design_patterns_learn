package com.db.design.strategy;

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
abstract class CashSuper{
    public abstract BigDecimal algorithm(BigDecimal priceCount);
}

class CashNormal extends CashSuper{
    @Override
    public BigDecimal algorithm(BigDecimal priceCount) {
        return priceCount;
    }
}


/**
 * 打折算法
 */
class CashRebate extends CashSuper{

    private BigDecimal rebate = new BigDecimal("0.8");

    public CashRebate(BigDecimal rebate) {
        this.rebate = rebate;
    }

    @Override
    public BigDecimal algorithm(BigDecimal priceCount) {
        return rebate.multiply(priceCount);
    }
}

class CashReturn extends CashSuper{

    private BigDecimal full = new BigDecimal("300");

    private BigDecimal reduce = new BigDecimal("100");

    public CashReturn(){

    }

    public CashReturn(BigDecimal full, BigDecimal reduce) {
        this.full = full;
        this.reduce = reduce;
    }

    @Override
    public BigDecimal algorithm(BigDecimal priceCount) {
        if(priceCount.compareTo(full) > 0){
            return priceCount.subtract(reduce);
        }else {
            return priceCount;
        }
    }
}

class CashContext{

    private CashSuper cashSuper;

    public CashContext(String type){

        switch (type){
            case "正常收费":
                this.cashSuper = new CashNormal();
                break;
            case "满300返100":
                this.cashSuper = new CashReturn();
                break;
            case "打折":
                this.cashSuper = new CashRebate(new BigDecimal("0.8"));
                break;
        }
    }

    public BigDecimal getResult(BigDecimal priceCount){
        System.out.println(cashSuper.algorithm(priceCount));
        return null;
    }

    public static void main(String[] args) {

        CashContext context2 = new CashContext("打折");
        context2.getResult(new BigDecimal("20"));

    }
}
