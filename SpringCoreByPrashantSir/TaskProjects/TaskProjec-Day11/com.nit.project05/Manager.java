package com.nit.project05;

public class Manager
{
    private String managerName;
    private String department;

    // Constructor Injection
    public Manager(String managerName, String department)
    {
        this.managerName = managerName;
        this.department = department;
    }

    @Override
    public String toString()
    {
        return "Manager Name : " + managerName +
               "\nDepartment   : " + department;
    }
}