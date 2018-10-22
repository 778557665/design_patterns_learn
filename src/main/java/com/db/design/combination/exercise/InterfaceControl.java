package com.db.design.combination.exercise;

import java.util.ArrayList;
import java.util.List;

public class InterfaceControl {

    public static void main(String[] args) {
        AbstractIC unitIC1,unitIC2,unitIC3,unitIC4;
        unitIC1 = new UnitIC("确认按钮");
        unitIC2 = new UnitIC("关闭按钮");

        unitIC3 = new UnitIC("输入文本框");
        unitIC4 = new UnitIC("显示框");


        ContainerIC containerIC1,containerIC2,containerIC3;
        containerIC1 = new ContainerIC("wzj的界面控件库");
        containerIC2 = new ContainerIC("单元控件");
        containerIC3 = new ContainerIC("容器控件");

        containerIC2.add(unitIC1);
        containerIC2.add(unitIC2);
        containerIC3.add(unitIC3);
        containerIC3.add(unitIC4);
        containerIC1.add(containerIC2);
        containerIC1.add(containerIC3);

        containerIC1.ICMethod();

    }
}

abstract class AbstractIC{
    public abstract void ICMethod();
}

class UnitIC extends AbstractIC{
    private String name;

    public UnitIC(String name){
        this.name = name;
    }

    public void ICMethod() {
        System.out.println("----我是一个" + name );
    }
}

class ContainerIC extends AbstractIC{

    private String name;

    private List<AbstractIC> abstractICList = new ArrayList<AbstractIC>();

    public ContainerIC(String name){
        this.name = name;
    }
    public void add(AbstractIC ic){
        abstractICList.add(ic);
    }

    public void remove(AbstractIC ic){
        abstractICList.remove(ic);
    }

    public AbstractIC get(int i){
        return abstractICList.get(i);
    }

    public void ICMethod() {
        System.out.println("****我是一个" + name);
        for (AbstractIC abstractIC : abstractICList) {
            abstractIC.ICMethod();
        }

    }
}