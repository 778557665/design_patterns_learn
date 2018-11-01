package com.db.design.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private List<Command> commandList = new ArrayList<>();

    public void setOrder(Command command){
        commandList.add(command);
    }

    public void cancelOrder(Command command){
        commandList.remove(command);
    }

    public void notifyBar(){
        for (Command command : commandList) {
            command.executeCommand();
        }
    }
}
