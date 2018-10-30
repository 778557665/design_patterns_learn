package com.db.design.builder.builder_base;

public class TestDemo {
    public static void main(String[] args) {

        Director director = new Director();
        Builder builder1 = new ConcreteBuilder1();
        director.construct(builder1);
        builder1.getResult().show();

        Builder builder2 = new ConcreteBuilder2();
        director.construct(builder2);
        builder2.getResult().show();
    }
}
