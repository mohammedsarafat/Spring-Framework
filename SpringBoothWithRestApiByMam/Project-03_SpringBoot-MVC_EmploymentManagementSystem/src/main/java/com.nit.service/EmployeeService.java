package com.nit.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nit.entity.Employee;

@Repository
public interface EmployeeService {
	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(long id);

	public void saveEmployee(Employee emp);

	public Employee updateEmployee(long id, Employee emp);

	public String deleteEmployee(long id);
}
