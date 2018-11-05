package com.db.pay;

public class AlipayPay extends AbstractBasePay {

    @Override
    protected void payinit() {
        System.out.println("加载支付宝配置");
    }

    @Override
    protected void paying() {
        System.out.println("支付宝支付中");
    }

    @Override
    protected void payPer() {
        System.out.println("支付宝支付完成");
    }
}
