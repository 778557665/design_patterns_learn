package com.db.design.memorandum;

public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public Memento() {
    }

    public String getState() {
        return state;
    }
}
