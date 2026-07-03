package com.mds.day09;

public class Resume {

    public String degree;
    public int experience;

    // Default Constructor
    public Resume() {
        System.out.println("Resume class constructor called");
    }

    // Parameterized Constructor
    public Resume(String degree, int experience) {
        super();
        System.out.println("Resume class parameterized");

        this.degree = degree;
        this.experience = experience;
    }

    // Getter and Setter for degree
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        System.out.println("Resume degree setter called");
        this.degree = degree;
    }

    // Getter and Setter for experience
    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        System.out.println("Resume experience setter called");
        this.experience = experience;
    }

    // toString()
    @Override
    public String toString() {
        return "Resume [degree=" + degree + ", experience=" + experience + "]";
    }

}
