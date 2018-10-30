package com.db.design.template.demo;

public abstract class AbstractClass {
    public abstract void operation1();

    public abstract void operation2();

    //模板方法，给出逻辑的骨架，而逻辑的是一些相应的抽象操作，留到子类实现
    public void templateMethod(){
        operation1();
        operation2();

        System.out.println("");
    }
}
