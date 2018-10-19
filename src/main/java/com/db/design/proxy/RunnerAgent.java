package com.db.design.proxy;

import java.util.Random;

public class RunnerAgent implements IRunner {

    private Runner runner;

    public RunnerAgent(Runner runner){
        this.runner = runner;
    }

    public void run() {
        Random random = new Random();
        if(random.nextBoolean()){
            System.out.println("运动员助理安排运动员跑步");
        }else {
            System.out.println("运动员助理不在，过会再来吧");
        }
    }
}

class TestDemo{
    public static void main(String[] args) {
        RunnerAgent runnerAgent = new RunnerAgent(new Runner());
        runnerAgent.run();
    }
}
