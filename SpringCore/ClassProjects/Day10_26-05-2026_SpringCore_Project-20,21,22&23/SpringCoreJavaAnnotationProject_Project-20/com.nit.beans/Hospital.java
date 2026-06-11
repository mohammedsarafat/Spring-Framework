package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hospital {
	@Value("Apollo")
	private String h_name;
	@Value("Jublee Hills")
	private String address;
	
	@Autowired
	private Patient p;
	
	public void display() {
		IO.println("Hospital Name is: " + h_name);
		IO.println("Hospital Address is: " + address);		
		p.details();
	}
}
