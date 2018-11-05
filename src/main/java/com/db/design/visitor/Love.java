package com.db.design.visitor;

public class Love extends Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println("男人恋爱时，凡事不懂都说懂");
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println("女人恋爱时，遇事懂也装不懂");
    }
}
