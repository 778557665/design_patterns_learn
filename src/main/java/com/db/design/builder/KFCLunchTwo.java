package com.db.design.builder;

public class KFCLunchTwo extends KFCLunchBuilder{

    public void buildStapleFood() {
        kfcLunch.setStapleFood("新奥尔良鸡腿堡");
    }

    public void buildNonStapleFood() {
        kfcLunch.setNonStapleFood("薯条");
    }

    public void buildDrink() {
        kfcLunch.setDrink("珍珠奶茶");
    }
}
