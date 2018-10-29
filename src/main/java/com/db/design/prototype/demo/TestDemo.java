package com.db.design.prototype.demo;

public class TestDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        Resume resume = new Resume("小张","23","浙大",new WorkExperience("1","alipay"));
        System.out.println(resume.toString());
        System.out.println(resume.hashCode());
        Resume resume1 = resume.clone();

        resume1.setWorkExperience("1","wangyi");
        System.out.println(resume1.toString());
        System.out.println(resume1.hashCode());

    }
}
