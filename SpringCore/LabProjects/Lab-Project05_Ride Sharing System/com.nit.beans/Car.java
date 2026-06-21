package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vehicle{

	@Override
	public String ride() {
		return "Auto ride started";
	}
}
