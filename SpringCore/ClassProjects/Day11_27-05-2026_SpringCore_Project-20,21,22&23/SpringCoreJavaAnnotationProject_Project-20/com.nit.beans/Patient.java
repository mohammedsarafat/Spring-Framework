package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Patient {
	
	@Value("9878")
	private int p_id;
	@Value("Raja")
	private String p_name;
	@Value("28")
	private double p_age;

	public void details() {
		IO.println("Id is: "+p_id);
		IO.println("Name is: "+p_name);
		IO.println("Age is: "+p_age);
	}

}
