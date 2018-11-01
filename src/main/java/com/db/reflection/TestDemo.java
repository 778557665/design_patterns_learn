package com.db.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestDemo {





    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchFieldException {
        //正射
        Apple apple = new Apple();
        apple.serPrice(4);


        //反射
        Class aClass = Class.forName("com.db.reflection.Apple");
        Method[] methods = aClass.getMethods();
        Method method = aClass.getMethod("serPrice",Integer.class);
        Object object = aClass.newInstance();
        method.invoke(object,4);


        Constructor constructor = aClass.getConstructor(String.class);
        Field field = aClass.getDeclaredField("name");
        field.setAccessible(true);
        field.set(object,"wzj");
//        Apple apple1 = (Apple)constructor.newInstance("wzj");
        System.out.println(object.toString());
    }
}
