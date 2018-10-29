package com.db.design.factory.demo;

public class UniversityStudentFactory extends LeiFengFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new UniversityStudent();
    }
}
