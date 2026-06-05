package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("st")
public class Student {
	
	@Value("101")
    private int id;
	
	@Value("Sarafat")
    private String name;
	
	@Value("CSE")
    private String branch;

	Student(){}
	
    public void displayStudent() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Branch: " + branch);
    }
}
