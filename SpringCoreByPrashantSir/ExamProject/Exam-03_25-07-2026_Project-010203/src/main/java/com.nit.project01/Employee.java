package com.nit.project01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Value("${employee.name}")
    private String name;

    @Value("${employee.basicSalary}")
    private double basicSalary;

    @Value("${employee.hraPercentage}")
    private double hraPercentage;

    @Value("${employee.daPercentage}")
    private double daPercentage;

    @Value("${employee.taxPercentage}")
    private double taxPercentage;

    public void displaySalaryDetails() {

        double hra = basicSalary * hraPercentage / 100;
        double da = basicSalary * daPercentage / 100;
        double grossSalary = basicSalary + hra + da;
        double tax = grossSalary * taxPercentage / 100;
        double netSalary = grossSalary - tax;

        System.out.println("------ Employee Salary Details ------");
        System.out.println("Employee Name   : " + name);
        System.out.println("Basic Salary    : " + basicSalary);
        System.out.println("HRA Percentage  : " + hraPercentage + "%");
        System.out.println("DA Percentage   : " + daPercentage + "%");
        System.out.println("Tax Percentage  : " + taxPercentage + "%");

        System.out.println("-------------------------------------");
        System.out.println("HRA             : " + hra);
        System.out.println("DA              : " + da);
        System.out.println("Gross Salary    : " + grossSalary);
        System.out.println("Tax             : " + tax);
        System.out.println("Net Salary      : " + netSalary);
    }
}
