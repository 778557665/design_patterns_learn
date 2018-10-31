package com.db.design.factory.abstractfactory;

public class Bike implements Car {
    @Override
    public void gotoWork() {
        System.out.println("骑自行车上班");
    }
}
