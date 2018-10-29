package com.db.design.simple_factory;

import java.math.BigDecimal;

public class AddOperation extends Operation{

    @Override
    public BigDecimal getResult() {
        return numberA.add(numberB);
    }
}
