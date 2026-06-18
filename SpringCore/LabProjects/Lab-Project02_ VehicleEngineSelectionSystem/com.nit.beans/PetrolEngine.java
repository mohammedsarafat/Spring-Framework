package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("petrolEngine")
public class PetrolEngine implements Engine{

	public void start() {
		
		IO.println("Petrol engine started 🚗");
	}
}
