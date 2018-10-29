package com.db.design.simple_factory;

import java.math.BigDecimal;

public class SubtractOperation extends Operation{

    @Override
    public BigDecimal getResult() {
        return numberA.subtract(numberB);
    }
}
