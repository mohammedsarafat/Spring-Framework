package com.nit.Project_02_SpringbootRestApi_EmployeeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.Project_02_SpringbootRestApi_EmployeeManagementSystem.enitity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
