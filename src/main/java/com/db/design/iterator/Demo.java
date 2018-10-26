package com.db.design.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<String> coll = new ArrayList<String>();
        Iterator<String> it = coll.iterator();

        while(it.hasNext()){
            String str = (String)it.next();
            System.out.println(str);
        }
    }
}
