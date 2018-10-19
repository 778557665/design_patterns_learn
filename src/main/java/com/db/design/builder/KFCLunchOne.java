package com.db.design.builder;

public class KFCLunchOne extends KFCLunchBuilder{

    public void buildStapleFood() {
        kfcLunch.setStapleFood("香辣鸡腿堡");
    }

    public void buildNonStapleFood() {
        kfcLunch.setNonStapleFood("薯条");
    }

    public void buildDrink() {
        kfcLunch.setDrink("可乐");
    }
}
