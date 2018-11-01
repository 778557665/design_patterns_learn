package com.db.design.command.base;

public class TestDemo {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.setCommand(new ConcreteCommand(new Receiver()));
        invoker.executeCommand();
    }
}
