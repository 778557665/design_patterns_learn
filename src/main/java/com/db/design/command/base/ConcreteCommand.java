package com.db.design.command.base;

/**
 * 将一个接受者对象绑定于一个动作，调用接受者相应的操作，以实现Execute
 */
public class ConcreteCommand extends Command {
    public ConcreteCommand(com.db.design.command.base.Receiver Receiver) {
        super(Receiver);
    }

    @Override
    public void executeCommand() {
        receiver.action();
    }
}
