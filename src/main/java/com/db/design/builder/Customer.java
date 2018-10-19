package com.db.design.builder;

public class Customer {

    public static void main(String[] args) {

        Director director = new Director();

        KFCLunchBuilder kfcLunchBuilder = new KFCLunchOne();

        director.setKfcLunchBuilder(kfcLunchBuilder);

        director.constructKFCLunch();

        System.out.println(director.getKFCLunch().toString());
    }
}
