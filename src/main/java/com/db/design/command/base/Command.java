package com.db.design.command.base;


/**
 * 用来声明执行操作的接口
 */
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver Receiver){
        this.receiver = receiver;
    }

    public abstract void executeCommand();
}
