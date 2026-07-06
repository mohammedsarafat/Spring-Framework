package com.nit.project03;

public class Teacher
{
    private String subject;
    private int experience;

    // Parameterized Constructor
    public Teacher(String subject, int experience)
    {
        this.subject = subject;
        this.experience = experience;
    }

    public void display()
    {
        System.out.println("Subject      : " + subject);
        System.out.println("Experience   : " + experience + " Years");
    }
}