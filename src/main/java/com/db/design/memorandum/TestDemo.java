package com.db.design.memorandum;

public class TestDemo {
    public static void main(String[] args) {

        Originator originator = new Originator();
        originator.setState("ON");
        originator.show();


        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(originator.createMemento());

        originator.setState("OFF");
        originator.show();

        originator.setMemento(careTaker.getMemento());
        originator.show();
    }
}
