package com.nit.project05;

public class Project
{
    private String projectName;
    private int duration;
    private Manager manager;

    // Constructor Injection only for Manager
    public Project(Manager manager)
    {
        this.manager = manager;
    }

    // Setter Injection
    public void setProjectName(String projectName)
    {
        this.projectName = projectName;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    public void display()
    {
        System.out.println("Project Name : " + projectName);
        System.out.println("Duration     : " + duration + " Months");
        System.out.println(manager);
    }
}