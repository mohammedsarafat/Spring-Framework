package com.nit.beans;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String dept;

	public Employee(int id, String name, double salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}

	public void display() {
		IO.println("Emp Id is: " + id);
		IO.println("Emp Name is: " + name);
		IO.println("Emp Salary is: " + salary);
		IO.println("Emp Dept is: " + dept);
	}
}
