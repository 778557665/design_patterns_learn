package com.db.design.command;

public class TestDemo {
    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer();
        Command command = new Mutton(barbecuer);
        Command command1 = new ChickenWings(barbecuer);
        Waiter waiter = new Waiter();
        waiter.setOrder(command);
        waiter.setOrder(command1);
        waiter.notifyBar();

    }
}
