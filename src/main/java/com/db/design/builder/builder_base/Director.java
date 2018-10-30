package com.db.design.builder.builder_base;

//指挥类
public class Director {

    public void construct(Builder builder){
        builder.builderPartA();
        builder.builderPartB();
    }
}
