package com.nit.Project_01_SpringbootRestApi.service;

import java.util.List;

import com.nit.Project_01_SpringbootRestApi.entity.Student;

public interface StudentService {
	public List<Student> getAllStident();

	public Student getStidentById(int id);

	public void saveStident(Student s);

	public void updateStident(int id, Student s);

	public void deleteStident(int id);
}
