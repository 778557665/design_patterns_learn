package com.db.design.state;

public class TestDemo {

    public static void main(String[] args) {

        Context context = new Context(new ConcreteStateC());
        context.request();
        context.request();
        context.request();


    }
}
