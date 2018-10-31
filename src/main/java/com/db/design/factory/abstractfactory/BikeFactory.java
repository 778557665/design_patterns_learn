package com.db.design.factory.abstractfactory;

public class BikeFactory extends AbstractCarFactory {

    @Override
    protected Bike produce() {
        return new Bike();
    }

}
