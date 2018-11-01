package com.db.design.state;

public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request(){
        state.handle(this);
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Context{" +
                "state=" + state.toString() +
                '}';
    }
}
