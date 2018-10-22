package com.db.design.combination;

import java.util.ArrayList;

public class TestDemo2 {

    public static void main(String[] args) {

    }
}

abstract class Component{
    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract Component getChild(int i);
    public abstract void operation();
}

class Leaf extends Component{

    public void add(Component c) {

    }

    public void remove(Component c) {

    }

    public Component getChild(int i) {
        return null;
    }

    public void operation() {

    }
}

class Composite extends Component{

    private ArrayList<Component> list = new ArrayList<Component>();

    public void add(Component c) {
        list.add(c);
    }

    public void remove(Component c) {
        list.remove(c);
    }

    public Component getChild(int i) {
        return (Component)list.get(i);
    }

    public void operation() {
        //容器构建具体业务方法的实现
        //递归调用成员构件的业务方法
        for(Object obj : list){
            ((Component)obj).operation();
        }
    }
}

