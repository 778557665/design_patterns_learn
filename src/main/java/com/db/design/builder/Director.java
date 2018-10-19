package com.db.design.builder;

public class Director {

    private KFCLunchBuilder kfcLunchBuilder;

    public void setKfcLunchBuilder(KFCLunchBuilder kfcLunchBuilder){
        this.kfcLunchBuilder = kfcLunchBuilder;
    }

    public KFCLunch getKFCLunch(){
        return kfcLunchBuilder.getKfcLunch();
    }

    public void constructKFCLunch() {
        kfcLunchBuilder.buildKFCLunch();
        kfcLunchBuilder.buildStapleFood();
        kfcLunchBuilder.buildNonStapleFood();
        kfcLunchBuilder.buildDrink();
    }

}
