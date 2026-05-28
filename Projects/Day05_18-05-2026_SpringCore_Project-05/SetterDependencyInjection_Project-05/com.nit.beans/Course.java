package com.nit.beans;

public class Course {
	private int c_id;
	private String c_name;
	private double c_fee;

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public double getC_fee() {
		return c_fee;
	}

	public void setC_fee(double c_fee) {
		this.c_fee = c_fee;
	}

	@Override
	public String toString() {
		return "Course [c_id=" + c_id + ", c_name=" + c_name + ", c_fee=" + c_fee + "]";
	}

	public void display() {
		IO.println("Course Id is: " + c_id);
		IO.println("Course Name is: " + c_name);
		IO.println("Course Fee is: " + c_fee);
	}
}
