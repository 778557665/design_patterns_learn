package com.db.design.visitor;

public class TestDemo {

    public static void main(String[] args) {

        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        Success v1 = new Success();
        objectStructure.display(v1);

        Fail v2 = new Fail();
        objectStructure.display(v2);

        Love v3 = new Love();
        objectStructure.display(v3);


    }
}
