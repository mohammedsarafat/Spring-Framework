package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
     
	@Autowired
	JdbcTemplate template;
	
	public void saveEmployee(Employee emp)
	{
		String query="INSERT INTO employee VALUES(?,?,?,?)";
		template.update(query,emp.getEmployeeId(),emp.getEmployeeName(),emp.getDepartment(),emp.getSalary());
		
	}
	
	public void saveSalary() {
		String query="INSERT INTO salary VALUES(1,101,50000,'JUNE')";
		template.update(query);
	}
}
