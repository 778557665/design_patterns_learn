package com.db.design.proxy.demo;

/**
 * 真正的追求者
 */
public class SuitorsA implements IGift{

    private Beauty beauty;

    public SuitorsA(Beauty beauty){
        this.beauty = beauty;
    }
    @Override
    public void giveFlowers() {
        System.out.println("送鲜花给" + beauty.name);
    }

    @Override
    public void giveChocolate() {
        System.out.println("送巧克力给" + beauty.name);
    }

    @Override
    public void giveIphoneX() {
        System.out.println("送IphoneX给" + beauty.name);
    }
}
