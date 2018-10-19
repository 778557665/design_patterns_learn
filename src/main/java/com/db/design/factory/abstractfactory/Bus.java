package com.db.design.factory.abstractfactory;

public class Bus extends AbstractCarFactory {
    protected void chooseCar() {
        System.out.println("今天做公交车上班");
    }
}
