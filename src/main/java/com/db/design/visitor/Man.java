package com.db.design.visitor;

public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManConclusion(this);
    }
}
