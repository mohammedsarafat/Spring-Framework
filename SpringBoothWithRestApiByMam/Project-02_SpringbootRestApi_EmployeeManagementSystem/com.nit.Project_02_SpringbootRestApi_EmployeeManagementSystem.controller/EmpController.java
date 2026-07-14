package com.nit.Project_02_SpringbootRestApi_EmployeeManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.Project_02_SpringbootRestApi_EmployeeManagementSystem.enitity.Employee;
import com.nit.Project_02_SpringbootRestApi_EmployeeManagementSystem.service.EmployeeService;

@RestController
public class EmpController {

	@Autowired
	EmployeeService service;

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}

	@GetMapping("/employee/{id}")
	public Employee getEmployeeBasedOnId(@PathVariable int id) {
		Employee emp = service.getEmployeeById(id);
		return emp;
	}
	@PostMapping("/employee/add")
	public void createEmployee(@RequestBody Employee emp) {
		service.saveEmployee(emp);
	}
	
	@PutMapping("/employee/update/{id}")
	public Employee updateEmployee(@PathVariable int id ,@RequestBody Employee emp) {
		return service.updateEmployee(id, emp);
	}
	
	
	@DeleteMapping("/employee/delete/{id}")
	public String deleteEmployee(@PathVariable int id ) {
		service.deleteEmployee(id);
		return "Deleted";
	}
	
}
