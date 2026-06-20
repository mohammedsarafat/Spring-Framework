package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("python")
public class PythonCourse implements Course{

	@Override
	public String getCourseName() {
		
		return "Python for Beginners";
	}
}
