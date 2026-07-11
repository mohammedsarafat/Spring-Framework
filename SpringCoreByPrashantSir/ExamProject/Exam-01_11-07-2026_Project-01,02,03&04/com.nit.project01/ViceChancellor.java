package com.nit.project01;

public class ViceChancellor {

    private String name;
    private String qualification;
    private int experience;

    public ViceChancellor() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "\nName          : " + name
                + "\nQualification : " + qualification
                + "\nExperience    : " + experience + " Years";
    }
}
