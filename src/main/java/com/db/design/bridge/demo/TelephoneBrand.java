package com.db.design.bridge.demo;

import java.util.ArrayList;
import java.util.List;

public abstract class TelephoneBrand {
    protected List<TelephoneSoft> softList = new ArrayList<>();

    public void setSoft(TelephoneSoft telephoneSoft){
        softList.add(telephoneSoft);
    }

    public abstract void run();
}
