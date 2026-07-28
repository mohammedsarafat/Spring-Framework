package com.nit.employee3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/nit/employee3/application.properties")
public class Employee {

    @Value("${employee.name}")
    private String name;

    @Value("${employee.department}")
    private String department;

    @Value("${employee.empId}")
    private int empId;

    @Value("${employee.salary}")
    private int salary;

    @Value("${employee.experience}")
    private int experience;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", empId=" + empId + ", salary=" + salary
				+ ", experience=" + experience + "]";
	}

    
}

