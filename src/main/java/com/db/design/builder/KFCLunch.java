package com.db.design.builder;

public class KFCLunch {

    //主食
    public String stapleFood;

    //副食
    public String nonStapleFood;

    //饮料
    public String drink;

    public String getStapleFood() {
        return stapleFood;
    }

    public void setStapleFood(String stapleFood) {
        this.stapleFood = stapleFood;
    }

    public String getNonStapleFood() {
        return nonStapleFood;
    }

    public void setNonStapleFood(String nonStapleFood) {
        this.nonStapleFood = nonStapleFood;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "KFCLunch{" +
                "stapleFood=" + stapleFood +
                ", nonStapleFood=" + nonStapleFood +
                ", drink=" + drink +
                '}';
    }
}
