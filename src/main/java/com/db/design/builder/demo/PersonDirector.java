package com.db.design.builder.demo;

/**
 * Created by admin on 2018/10/29.
 */
public class PersonDirector {

    private PersonBuilder personBuilder;

    public PersonDirector(PersonBuilder personBuilder){
        this.personBuilder = personBuilder;
    }

    public void createPerson(){
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildArmLeft();
        personBuilder.buildArmRight();
        personBuilder.buildLegLeft();
        personBuilder.buildLegRight();
    }
}
