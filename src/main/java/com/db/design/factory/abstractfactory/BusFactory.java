package com.db.design.factory.abstractfactory;

public class BusFactory extends AbstractCarFactory {
    @Override
    protected Bus produce() {
        return new Bus();
    }
}
