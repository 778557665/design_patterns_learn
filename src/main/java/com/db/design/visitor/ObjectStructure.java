package com.db.design.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private List<Person> personList = new ArrayList<>();

    public void attach(Person person){
        personList.add(person);
    }

    public void Detach(Person person){
        personList.remove(person);
    }

    public void display(Action action){
        for (Person person : personList) {
            person.accept(action);
        }
    }
}
