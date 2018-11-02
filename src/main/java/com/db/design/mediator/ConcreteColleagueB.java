package com.db.design.mediator;

public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }
    public void send(String message){
        mediator.send(message,this);
    }
    public void notifyB(String message){
        System.out.println("同事B得到消息"+message);
    }
}
