package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
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

	Student() {
	}

	@Autowired  //Field injection
	private Address address; // HAS-A relationship

	// @Autowired  //Construction injection
	public Student(Address address) {
		super();
		this.address = address;
		System.out.println("Student.Student()");
	}

	//@Autowired //Setter injection
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Student.setAddress()");
	}

	public void displayStudent() {
		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
		System.out.println("Branch: " + branch);
		address.displayAddress();
	}
}
