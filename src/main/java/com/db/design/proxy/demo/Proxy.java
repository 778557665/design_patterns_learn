package com.db.design.proxy.demo;

/**
 * 代理类
 */
public class Proxy implements IGift {

    private SuitorsA suitorsA;

    public Proxy(Beauty beauty){
        this.suitorsA = new SuitorsA(beauty);
    }

    @Override
    public void giveFlowers() {
        suitorsA.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        suitorsA.giveChocolate();
    }

    @Override
    public void giveIphoneX() {
        suitorsA.giveIphoneX();
    }
}
