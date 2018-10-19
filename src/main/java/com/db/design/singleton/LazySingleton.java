package com.db.design.singleton;

public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton(){}

    public static LazySingleton getLazySingleton(){

        if(null == lazySingleton){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
