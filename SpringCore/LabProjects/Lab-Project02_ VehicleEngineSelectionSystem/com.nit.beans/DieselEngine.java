package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("dieselEngine")
public class DieselEngine implements Engine{

	public void start() {
		
		IO.println("Diesel engine started 🚛");
	}
}
