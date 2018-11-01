package com.db.design.bridge.demo;

public class BrandB extends TelephoneBrand {
    @Override
    public void run() {
        System.out.println("我是B品牌手机我有以下功能--------");
        for (TelephoneSoft telephoneSoft : softList) {
            telephoneSoft.run();
        }
    }
}
