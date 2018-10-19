package com.db.design.prototype;

import java.util.ArrayList;

public class Mail implements Cloneable{

    /**
     * 优点：
     *  1，使用原型模型创建一个对象比直接new一个对象更有效率，因为它直接操作内存中的二进制流，特别是复制大对象时，性能的差别非常明显。
     *  2，隐藏了制造新实例的复杂性，使得创建对象就像我们在编辑文档时的复制粘贴一样简单。
     * 缺点：
     *  1，由于使用原型模式复制对象时不会调用类的构造方法，所以原型模式无法和单例模式组合使用，因为原型类需要将clone方法的作用域修改为public类型，那么单例模式的条件就无法满足了。
     *  2，使用原型模式时不能有final对象。
     *  3，Object类的clone方法只会拷贝对象中的基本数据类型，对于数组，引用对象等只能另行拷贝。这里涉及到深拷贝和浅拷贝的概念。
     * 深拷贝与浅拷贝：
     *  浅拷贝：
     *      将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的（这样不安全）。
     *  深拷贝：
     *      将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。
     *  那么深拷贝如何具体实现呢？
     *      增加了一个ArrayList属性。
     *
     *  适用场景：
     *  1，复制对象的结构和数据。
     *  2，希望对目标对象的修改不影响既有的原型对象。
     *  3，创建一个对象的成本比较大。
     */

    private String invitedReason;

    private String location;

    private String time;

    private String name;

    private ArrayList<String> ars;

    public Mail(String invitedReason, String location, String time, String name){
        this.invitedReason = invitedReason;
        this.location = location;
        this.time = time;
        this.name = name;
    }

    public String getInvitedReason() {
        return invitedReason;
    }

    public void setInvitedReason(String invitedReason) {
        this.invitedReason = invitedReason;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Mail clone() throws CloneNotSupportedException {

        Mail mail = (Mail) super.clone();
        //深拷贝
        mail.ars = (ArrayList<String>) this.ars.clone();

        return mail;
    }


    @Override
    public String toString() {
        return "Mail{" +
                "invitedReason='" + invitedReason + '\'' +
                ", location='" + location + '\'' +
                ", time='" + time + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
