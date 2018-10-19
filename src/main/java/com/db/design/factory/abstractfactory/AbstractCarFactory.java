package com.db.design.factory.abstractfactory;

public abstract class AbstractCarFactory implements Car {

    public void gotoWork() {
        chooseCar();
    }

    protected abstract void chooseCar();
}
