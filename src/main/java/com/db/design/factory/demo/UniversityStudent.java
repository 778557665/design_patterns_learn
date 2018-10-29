package com.db.design.factory.demo;

public class UniversityStudent implements LeiFeng{
    @Override
    public void wash() {
        System.out.println("大学生学雷锋帮助老人洗衣");
    }

    @Override
    public void sweep() {
        System.out.println("大学生学雷锋帮助老人扫地");
    }

    @Override
    public void chat() {
        System.out.println("大学生学雷锋和老人聊天");
    }
}
