package com.db.design.visitor;

public class Fail extends Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println("男人失败时，背闷头喝酒，谁也不用劝");
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println("女人失败时，眼泪汪汪，谁也劝不了");
    }
}
