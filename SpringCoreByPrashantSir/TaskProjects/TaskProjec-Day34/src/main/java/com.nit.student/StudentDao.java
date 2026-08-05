package com.nit.student;

public interface StudentDao {

	// Task 1: Count Students
	public Integer getStudentCount();

	// Task 2: Get Student Name by Id
	public String getStudentNameById(Integer studentId);

	// Task 3: Get Student Fees by Id
	public Double getStudentFeesById(Integer studentId);

}
