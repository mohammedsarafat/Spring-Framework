package com.nit.employee;

public class Employee {

    private String name;
    private String department;
    private int empId;
    private int salary;
    private int experience;

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name +
                ", department=" + department +
                ", empId=" + empId +
                ", salary=" + salary +
                ", experience=" + experience + "]";
    }
}

