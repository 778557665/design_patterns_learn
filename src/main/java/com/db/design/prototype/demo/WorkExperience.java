package com.db.design.prototype.demo;

public class WorkExperience implements Cloneable{

    public String years;

    public String companyName;

    public WorkExperience(String years, String companyName) {
        this.years = years;
        this.companyName = companyName;
    }

    @Override
    protected WorkExperience clone() throws CloneNotSupportedException {
        WorkExperience workExperience = (WorkExperience)super.clone();
        return workExperience;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
