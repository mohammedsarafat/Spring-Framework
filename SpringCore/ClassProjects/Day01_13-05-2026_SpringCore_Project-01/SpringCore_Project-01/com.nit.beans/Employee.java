package com.nit.beans;

public class Employee {
    private  int id;
    private  String name;
    private  Double salary;
    private   String Dept;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", Dept=" + Dept + "]";
	}
    
    public void display()
    {
    	System.out.println("Emp ID is: "+id);
    	System.out.println("Emp NAME is: "+name);
    	System.out.println("Emp SALARY is: "+salary);
    	System.out.println("Emp DEPARTMENT is: "+Dept);
    }
      
}
