package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("auto")
public class Auto implements Vehicle{

	@Override
	public String ride() {
		return "Auto ride started";
	}
}
