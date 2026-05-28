package com.nit.beans;

public class Student {
	private int s_id;
	private String s_name;
	private String s_branch;
	private int s_age;

	Course c;

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_branch() {
		return s_branch;
	}

	public void setS_branch(String s_branch) {
		this.s_branch = s_branch;
	}

	public int getS_age() {
		return s_age;
	}

	public void setS_age(int s_age) {
		this.s_age = s_age;
	}

	public Course getC() {
		return c;
	}

	public void setC(Course c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", s_branch=" + s_branch + ", s_age=" + s_age + ", c="
				+ c + "]";
	}

	public void display() {
		IO.println("Student Id is: " + s_id);
		IO.println("Student Name is: " + s_name);
		IO.println("Student Branch is: " + s_branch);
		IO.println("Student Age is: " + s_age);
		IO.println("Student Course is: " + c);
	}
}
