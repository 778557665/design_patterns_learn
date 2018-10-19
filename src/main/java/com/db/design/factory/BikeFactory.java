package com.db.design.factory;

public class BikeFactory implements CarFactory {
    public Car getCar() {
        return new Bike();
    }
}
