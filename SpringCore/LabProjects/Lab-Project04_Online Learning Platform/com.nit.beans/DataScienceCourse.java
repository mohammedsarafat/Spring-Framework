package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("dataScience")
public class DataScienceCourse implements Course{

	@Override
	public String getCourseName() {
		
		return "Data Science with ML";
	}
}
