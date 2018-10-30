package com.db.design.template;

public class StudentA extends TestPaper{
    @Override
    public void questionA() {
        super.questionA();
        System.out.println("B");
    }

    @Override
    public void questionB() {
        super.questionB();
        System.out.println("B");
    }

    @Override
    public void questionC() {
        super.questionC();
        System.out.println("B");
    }
}
