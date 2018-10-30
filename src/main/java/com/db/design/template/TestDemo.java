package com.db.design.template;

public class TestDemo {

    public static void main(String[] args) {

        TestPaper testPaperA = new StudentA();
        testPaperA.questionA();
        testPaperA.questionB();
        testPaperA.questionC();

        TestPaper testPaperB = new StudentB();
        testPaperB.questionA();
        testPaperB.questionB();
        testPaperB.questionC();
    }
}
