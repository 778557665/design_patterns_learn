package com.db.design.command;

public class Mutton extends Command{
    public Mutton(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeCommand() {
        barbecuer.BakeMutton();
    }
}
