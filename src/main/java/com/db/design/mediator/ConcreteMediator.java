package com.db.design.mediator;

//具体中介类
public class ConcreteMediator extends Mediator {

    private ConcreteColleagueA concreteColleagueA;

    private ConcreteColleagueB concreteColleagueB;

    public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA) {
        this.concreteColleagueA = concreteColleagueA;
    }

    public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB) {
        this.concreteColleagueB = concreteColleagueB;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if(colleague == concreteColleagueA){
            concreteColleagueB.notifyB(message);
        }else
            concreteColleagueA.notifyA(message);
    }
}
