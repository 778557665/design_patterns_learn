package com.db.design.builder.demo;

/**
 * Created by admin on 2018/10/29.
 */
public abstract class PersonBuilder {

    protected String x;

    protected String y;

    public PersonBuilder(String x, String y) {
        this.x = x;
        this.y = y;
    }

    public abstract void buildHead();

    public abstract void buildBody();

    public abstract void buildArmLeft();

    public abstract void buildArmRight();

    public abstract void buildLegLeft();

    public abstract void buildLegRight();
}
