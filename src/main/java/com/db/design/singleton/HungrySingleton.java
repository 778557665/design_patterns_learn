package com.db.design.singleton;

public class HungrySingleton {

    //饿汉式单例
    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getHungrySingleton(){
        return singleton;
    }
}
