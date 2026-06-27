package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDAO dao;

	@Transactional
	public void saveEmployeeSalary(Employee emp) {

		dao.saveEmployee(emp);
		// int x = 10 / 0;
		dao.saveSalary();

		System.out.println("Employee Salary Record Saved Successfully");
	}
}
