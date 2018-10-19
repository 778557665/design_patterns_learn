package com.db.design.factory.abstractfactory;

public class Bike extends AbstractCarFactory {
    protected void chooseCar() {
        System.out.println("今天骑自行车上班");
    }
}
