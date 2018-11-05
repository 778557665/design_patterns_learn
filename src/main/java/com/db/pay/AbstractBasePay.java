package com.db.pay;

public abstract class AbstractBasePay implements PayMent {

    @Override
    public void pay() {
        payinit();

        paying();

        payPer();
    }

    protected abstract void payinit();

    protected abstract void paying();

    protected abstract void payPer();
}
