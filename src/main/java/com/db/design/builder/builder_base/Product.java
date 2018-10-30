package com.db.design.builder.builder_base;

import java.util.ArrayList;
import java.util.List;

//产品类
public class Product {

    List<String> partList = new ArrayList<>();

    public void add(String parts){
        partList.add(parts);
    }

    public void show(){
        for (String s : partList) {
            System.out.println(s);
        }

    }
}
