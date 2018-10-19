package com.db.design.factory;

public class BusFactory implements CarFactory {
    public Car getCar() {
        return new Bus();
    }
}
