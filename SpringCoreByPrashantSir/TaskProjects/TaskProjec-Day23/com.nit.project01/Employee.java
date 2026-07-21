package com.nit.project01;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Value("${Employee_name}")
    private String employeeName;

    @Value("${Employee_id}")
    private String employeeId;

    @Value("${Employee_experience}")
    private int experience;

    @Value("${Employee_projectCompleted}")
    private boolean projectCompleted;

    @Value("${Employee_basicSalary}")
    private long basicSalary;

    public long getIncrementSalary() {

        if (projectCompleted) {
            basicSalary += 50000;
        }

        return basicSalary;
    }

    public void display() {

        System.out.println("Employee Name       : " + employeeName);
        System.out.println("Employee ID         : " + employeeId);
        System.out.println("Experience          : " + experience);
        System.out.println("Project Completed   : " + projectCompleted);
        System.out.println("Increment Salary    : " + getIncrementSalary());

    }

}
