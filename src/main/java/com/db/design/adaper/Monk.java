package com.db.design.adaper;

import org.junit.Test;

//和尚
public interface Monk {
    //念经
    public void nj();
    //敲木鱼
    public void qmy();
    //习武
    public void xw();
    //吃斋饭
    public void czf();
}

//和尚的一个适配器
abstract class MonkAdapter implements Monk{
    public void nj() {

    }

    public void qmy() {

    }

    public void xw() {

    }

    public void czf() {

    }
}

//鲁智深 只习武
class Lzs extends MonkAdapter{
    //需要要实现习武方法

    @Override
    public void xw() {
        System.out.println("倒拔垂杨柳");
    }
}

//唐僧 不习武
class Ts extends MonkAdapter{
    @Override
    public void nj() {
        System.out.println("念紧箍咒");
    }

    @Override
    public void qmy() {
        System.out.println("平时没事念经的时候 就喜欢敲敲木鱼");
    }

    @Override
    public void czf() {
        System.out.println("我只吃素，阿弥陀佛");
    }
}
