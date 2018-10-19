package com.db.design.builder;

public abstract class KFCLunchBuilder{

    protected KFCLunch kfcLunch;

    public KFCLunch getKfcLunch(){
        return kfcLunch;
    }

    public void buildKFCLunch(){
        kfcLunch = new KFCLunch();
        System.out.println("生产了一份豪华午餐");
    }

    public abstract void buildStapleFood();

    public abstract void buildNonStapleFood();

    public abstract void buildDrink();

}
