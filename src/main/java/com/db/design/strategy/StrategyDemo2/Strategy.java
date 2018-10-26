package com.db.design.strategy.StrategyDemo2;

public abstract class Strategy {

    public abstract void algorithm();

    class algorithmA extends Strategy{

        @Override
        public void algorithm() {

        }
    }

    class algorithmB extends Strategy{
        @Override
        public void algorithm() {

        }
    }

    class algorithmC extends Strategy{
        @Override
        public void algorithm() {

        }
    }

    class Context{
       public Strategy strategy;
       public Context(Strategy strategy){
           this.strategy = strategy;
       }

       public void contextInterface(){
           strategy.algorithm();
       }
    }
}


