package com.nit.Project_02_SpringbootRestApi_EmployeeManagementSystem.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nit.Project_02_SpringbootRestApi_EmployeeManagementSystem.enitity.Employee;

@Repository
public interface EmployeeService {
	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(int id);

	public void saveEmployee(Employee emp);

	public Employee updateEmployee(int id, Employee emp);

	public String deleteEmployee(int id);
}
