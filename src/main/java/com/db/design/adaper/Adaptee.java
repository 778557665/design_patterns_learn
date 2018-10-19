package com.db.design.adaper;

//Source：需要被适配的类、接口、对象，即Datas。
//Destination：需要得到的类，Source通过适配得到的类对象，也就是我们期待得到的借口。
//Adapter：适配器类，协调Source和Destination，使两者能够协同工作。
public class Adaptee {

    public void specificRequest(){
        System.out.println("特殊请求，这个是源角色");
    }

}
