package com.db.design.factory.abstractfactory;

import org.junit.Test;

public class TestFactory {
    @Test
    public void test() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        vehicleChoose("com.db.design.factory.abstractfactory.BusFactory");
        vehicleChoose("com.db.design.factory.abstractfactory.BikeFactory");
    }


    private void vehicleChoose(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class clazz = Class.forName(className);
        AbstractCarFactory abstractCarFactory = (AbstractCarFactory) clazz.newInstance();
        Car bus = abstractCarFactory.produce();
        bus.gotoWork();
    }
}
