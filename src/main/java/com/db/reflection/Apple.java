package com.db.reflection;

public class Apple {

    private String name;

    public Apple(String name) {
        this.name = name;
    }

    public Apple() {
    }



    public void serPrice(Integer price){
        System.out.println("价格设置为：" + price);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                '}';
    }
}
