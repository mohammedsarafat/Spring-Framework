package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("java")
public class JavaCourse implements Course{

	@Override
	public String getCourseName() {
		
		return "Java Programming";
	}
}
