package com.db.design.proxy.demo;

public class TestDemo {

    public static void main(String[] args) {

        Proxy proxy = new Proxy(new Beauty("sex lady"));
        proxy.giveFlowers();
        proxy.giveChocolate();
        proxy.giveIphoneX();


    }
}
