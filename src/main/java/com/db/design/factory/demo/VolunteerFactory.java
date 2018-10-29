package com.db.design.factory.demo;

public class VolunteerFactory extends LeiFengFactory{
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
