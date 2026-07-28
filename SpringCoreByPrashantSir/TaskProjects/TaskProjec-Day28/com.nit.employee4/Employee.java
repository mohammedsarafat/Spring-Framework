package com.nit.employee4;

public class Employee {

    private String name;
    private String department;
    private int empId;
    private int salary;
    private int experience;

    public Employee() {
    }

    public Employee(String name, String department, int empId, int salary, int experience) {
        this.name = name;
        this.department = department;
        this.empId = empId;
        this.salary = salary;
        this.experience = experience;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", empId=" + empId +
                ", salary=" + salary +
                ", experience=" + experience +
                ']';
    }
}
