package com.db.pay;

public class WechatPay extends AbstractBasePay {

    @Override
    protected void payinit() {
        System.out.println("加载微信配置");
    }

    @Override
    protected void paying() {
        System.out.println("微信支付中");
    }

    @Override
    protected void payPer() {
        System.out.println("微信支付完成");
    }
}
