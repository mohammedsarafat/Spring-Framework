package com.nit.Project_02_SpringbootRestApi_EmployeeManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.Project_02_SpringbootRestApi_EmployeeManagementSystem.enitity.Employee;
import com.nit.Project_02_SpringbootRestApi_EmployeeManagementSystem.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService{

	@Autowired
	EmployeeRepository repo;
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> emps = repo.findAll();
		return emps;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee emp = repo.findById(id).get();
		return emp;
	}

	@Override
	public void saveEmployee(Employee emp) {
		repo.save(emp);
		
	}

	@Override
	public Employee updateEmployee(int id, Employee emp) {
		Employee emp1= repo.findById(id).get();
		emp1.setName(emp.getName());
		emp1.setDept(emp.getDept());
		emp1.setMob(emp.getMob());
		return repo.save(emp1);
	}

	@Override
	public String deleteEmployee(int id) {
		Employee emp = repo.findById(id).get();	
		repo.delete(emp);
		return "Deleted";
	}
	
}
