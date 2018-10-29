package com.db.design.factory.demo;

public class TestDemo {

    public static void main(String[] args) {
        LeiFengFactory leiFengFactory = new VolunteerFactory();
        LeiFeng volunteer = leiFengFactory.createLeiFeng();
        volunteer.chat();
        volunteer.sweep();
        volunteer.wash();
    }
}
