package com.db.design.simple_factory;

import java.math.BigDecimal;

public class DivideOperation extends Operation{

    @Override
    public BigDecimal getResult() {
        return numberA.divide(numberB);
    }
}
