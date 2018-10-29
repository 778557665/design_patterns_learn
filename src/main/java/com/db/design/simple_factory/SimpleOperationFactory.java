package com.db.design.simple_factory;

import java.math.BigDecimal;

public class SimpleOperationFactory {


    public static Operation operation;

    public static Operation createOperation(String name){
        switch (name){
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation =new SubtractOperation();
                break;
            case "*":
                operation = new MultiplyOperation();
                break;
            case "/":
                operation = new DivideOperation();
                break;
        }
        return operation;
    }
}
