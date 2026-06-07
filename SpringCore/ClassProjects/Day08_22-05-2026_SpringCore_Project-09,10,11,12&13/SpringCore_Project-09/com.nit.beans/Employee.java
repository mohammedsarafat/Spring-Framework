package com.nit.beans;

public class Employee {

    private int empId;
    private String empName;
    private double salary;
    private Department dept;

    // setters
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    // method
    public void display() {
        System.out.println("Employee Id   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary        : " + salary);
        System.out.println("Department    : " + dept.getDeptName());
    }
}
