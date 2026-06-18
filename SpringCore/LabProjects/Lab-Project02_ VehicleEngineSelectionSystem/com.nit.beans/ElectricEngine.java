package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("electricEngine")
public class ElectricEngine implements Engine{

	public void start() {
		
		IO.println("Electric engine started ⚡");
	}
}
