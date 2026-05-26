package com.nit.beans;

public class Customer {
	private int id;
	private String name;
	private String addr;
	
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
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}
	public void display() {
		IO.println("Customer Id is: "+id);
		IO.println("Customer Name is: "+name);
		IO.println("Customer Dept is: "+addr);
	}
}
