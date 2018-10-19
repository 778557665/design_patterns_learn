package com.db.design.factory.abstractfactory;

import org.junit.Test;

public class TestFactory {
    @Test
    public void test() {
        Car car = new Bike();
        car.gotoWork();

        Car car1 = new Bus();
        car1.gotoWork();
    }
}
