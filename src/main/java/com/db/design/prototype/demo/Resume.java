package com.db.design.prototype.demo;

public class Resume implements Cloneable {

    public String name;

    public String age;

    public String graduation;

    public WorkExperience workExperience;

    public Resume(String name, String age, String graduation, WorkExperience workExperience) {
        this.name = name;
        this.age = age;
        this.graduation = graduation;
        this.workExperience = workExperience;
    }

    public Resume() {
    }



    @Override
    protected Resume clone() throws CloneNotSupportedException {
        Resume resume = (Resume)super.clone();
        WorkExperience workExperience_clone = workExperience.clone();
        resume.setWorkExperience(workExperience_clone);
        return resume;
    }

    private void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", graduation='" + graduation + '\'' +
                ", workExperience_name=" + workExperience.companyName +
                ", workExperience_years=" + workExperience.years +
                ", workExperience=" + workExperience.hashCode() +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }

    public void setWorkExperience(String years,String company) {
        this.workExperience.years = years;
        this.workExperience.companyName = company;
    }
}
