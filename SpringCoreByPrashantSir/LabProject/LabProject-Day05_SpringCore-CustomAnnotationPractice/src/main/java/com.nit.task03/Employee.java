package com.nit.task03;

public class Employee {

    private int id;
    private String name;
    private double salary;

    private Department department;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id
                + ", name=" + name
                + ", salary=" + salary
                + ", department=" + department + "]";
    }
}
