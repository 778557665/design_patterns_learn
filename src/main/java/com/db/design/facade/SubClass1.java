package com.db.design.facade;


//子系统角色  就不建多个类了
public class SubClass1 {
    public void method1(){
        System.out.println("这是类1里的第一个方法");
    }
    public void method2(){
        System.out.println("这是类1里的第二个方法");
    }
}

class SubClass2{
    public void method1(){
        System.out.println("这是类2里的第一个方法");
    }

    public void method2(){
        System.out.println("这是类2里的第二个方法");
    }
}

class SubClass3{
    public void method1(){
        System.out.println("这是类3里的第一个方法");
    }

    public void method2(){
        System.out.println("这是类3里的第二个方法");
    }
}