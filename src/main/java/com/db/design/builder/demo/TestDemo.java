package com.db.design.builder.demo;

/**
 * Created by admin on 2018/10/29.
 */
public class TestDemo {

    public static void main(String[] args) {

        PersonThinBuilder personThinBuilder = new PersonThinBuilder("13","11");
        PersonDirector personDirector = new PersonDirector(personThinBuilder);
        personDirector.createPerson();
    }
}
