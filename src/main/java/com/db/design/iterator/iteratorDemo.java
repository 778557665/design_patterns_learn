package com.db.design.iterator;

import java.util.ArrayList;
import java.util.List;

public class iteratorDemo {

    public static void main(String[] args) {
        Aggregate ag = new ConcreteAggregate();
        ag.add("小明");
        ag.add("小红");
        ag.add("小刚");
        Iterator it = ag.iterator();
        while(it.hasNext()){
            String str = (String)it.next();
            System.out.println(str);
        }
    }
}

interface Iterator {
    public Object next();
    public boolean hasNext();
}

class ConcreteIterator implements Iterator{

    private List list = new ArrayList();

    private int cursor = 0;

    public ConcreteIterator(List list){
        this.list = list;
    }
    public Object next() {
        Object obj = null;
        if(this.hasNext()){
            obj = this.list.get(cursor++);
        }
        return obj;
    }

    public boolean hasNext() {
        if(cursor == list.size()){
            return false;
        }
        return true;
    }
}

interface Aggregate{
    public void add(Object obj);
    public void remove(Object obj);
    public Iterator iterator();
}

class ConcreteAggregate implements Aggregate{

    private List list = new ArrayList();

    public void add(Object obj) {
        list.add(obj);
    }

    public void remove(Object obj) {
        list.remove(obj);
    }

    public Iterator iterator() {
        return new ConcreteIterator(list);
    }
}
