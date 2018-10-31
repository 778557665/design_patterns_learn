package com.db.design.factory.abstractfactory;

public class Bus implements Car{
    @Override
    public void gotoWork() {
        System.out.println("开车上班");
    }
}
