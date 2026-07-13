package com.nit.Project_01_SpringbootRestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.Project_01_SpringbootRestApi.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	public void getStudentByName();

}
