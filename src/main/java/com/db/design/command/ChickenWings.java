package com.db.design.command;

public class ChickenWings extends Command{

    public ChickenWings(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeCommand() {
        barbecuer.BakeChickenWing();
    }
}
