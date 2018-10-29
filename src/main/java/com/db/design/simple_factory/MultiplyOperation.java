package com.db.design.simple_factory;

import java.math.BigDecimal;

public class MultiplyOperation extends Operation{

    @Override
    public BigDecimal getResult() {
        return numberA.multiply(numberB);
    }
}
