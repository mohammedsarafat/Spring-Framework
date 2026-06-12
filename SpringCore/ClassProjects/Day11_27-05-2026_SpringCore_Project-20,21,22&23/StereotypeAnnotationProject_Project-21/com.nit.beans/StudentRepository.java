package com.nit.beans;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
	
	public void display() {
		IO.println("This class is having student db access.");
	}	
}
