package com.nit.Project_01_SpringbootRestApi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String branch;
	private long mob_num;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String branch, long mob_num) {
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.mob_num = mob_num;
	}

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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public long getMob_num() {
		return mob_num;
	}

	public void setMob_num(long mob_num) {
		this.mob_num = mob_num;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", mob_num=" + mob_num + "]";
	}

}
