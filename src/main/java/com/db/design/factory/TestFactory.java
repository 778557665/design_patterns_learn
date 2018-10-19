package com.db.design.factory;

import org.junit.Test;

public class TestFactory {
    @Test
    public void test() {
        CarFactory factory = null;
        // bike
        factory = new BikeFactory();
        Car bike = factory.getCar();
        bike.gotoWork();

        // bus
        factory = new BusFactory();
        Car bus = factory.getCar();
        bus.gotoWork();
    }
}
