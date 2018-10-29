package com.db.design.simple_factory;

import java.math.BigDecimal;

public class TestDemo {
    public static void main(String[] args) {
        Operation operation = SimpleOperationFactory.createOperation("+");
        operation.setNumberA(new BigDecimal("88"));
        operation.setNumberB(new BigDecimal("66"));
        System.out.println(operation.getResult());
    }
}
