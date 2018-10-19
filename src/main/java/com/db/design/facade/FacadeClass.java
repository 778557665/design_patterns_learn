package com.db.design.facade;


//外观角色类
public class FacadeClass {

    public void facadeMethod(){
        SubClass1 subClass1 = new SubClass1();
        subClass1.method1();
        SubClass2 subClass2 = new SubClass2();
        subClass2.method1();
        SubClass3 subClass3 = new SubClass3();
        subClass3.method1();

    }



}
class TestDemo{

    public static void main(String[] args) {
        FacadeClass facadeClass = new FacadeClass();
        facadeClass.facadeMethod();
    }
}