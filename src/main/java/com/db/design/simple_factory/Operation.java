package com.db.design.simple_factory;

import java.math.BigDecimal;

public abstract class Operation {

    public BigDecimal numberA;

    public BigDecimal numberB;

    public BigDecimal getNumberA() {
        return numberA;
    }

    public void setNumberA(BigDecimal numberA) {
        this.numberA = numberA;
    }

    public BigDecimal getNumberB() {
        return numberB;
    }

    public void setNumberB(BigDecimal numberB) {
        this.numberB = numberB;
    }

    public abstract BigDecimal getResult();
}
