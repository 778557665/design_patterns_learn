package com.db.design.adaper.object;

import com.db.design.adaper.Adaptee;
import com.db.design.adaper.Target;

public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specificRequest();
    }
}
