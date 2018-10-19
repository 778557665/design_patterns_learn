package com.db.design.decorator;

public class AppleGiftBox implements Apple {

    private SimpleApple simpleApple;

    public AppleGiftBox(SimpleApple simpleApple){
        this.simpleApple = simpleApple;
    }

    public void eat() {
        System.out.println("吃之前还能欣赏");
        System.out.println("平安夜都要买这种包装的苹果");
        simpleApple.eat();
    }
}

class TestDemo{
    public static void main(String[] args) {

        AppleGiftBox appleGiftBox = new AppleGiftBox(new SimpleApple());
        appleGiftBox.eat();
    }
}
