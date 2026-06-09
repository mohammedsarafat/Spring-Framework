package com.nit.beans;

import java.util.Set;

public class Employee {

    private int empId;
    private String empName;
    private String designation;

    private Set<String> projects;

    public Employee() {
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Set<String> getProjects() {
        return projects;
    }

    public void setProjects(Set<String> projects) {
        this.projects = projects;
    }

    public void displayEmployeeDetails() {

        System.out.println("Employee Id      : " + empId);
        System.out.println("Employee Name    : " + empName);
        System.out.println("Designation      : " + designation);

        System.out.println("\nAssigned Projects");

        for(String project : projects) {
            System.out.println(project);
        }
    }
}
