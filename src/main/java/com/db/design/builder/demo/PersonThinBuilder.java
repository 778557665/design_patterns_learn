package com.db.design.builder.demo;

/**
 * Created by admin on 2018/10/29.
 */
public class PersonThinBuilder extends PersonBuilder{


    public PersonThinBuilder(String x, String y) {
        super(x, y);
    }

    @Override
    public void buildHead() {
        System.out.println("画一个头");
    }

    @Override
    public void buildBody() {
        System.out.println("画一个身体");
    }

    @Override
    public void buildArmLeft() {
        System.out.println("画一个左手");
    }

    @Override
    public void buildArmRight() {
        System.out.println("画一个右手");
    }

    @Override
    public void buildLegLeft() {
        System.out.println("画一个左脚");
    }

    @Override
    public void buildLegRight() {
        System.out.println("画一个右左脚");
    }
}
