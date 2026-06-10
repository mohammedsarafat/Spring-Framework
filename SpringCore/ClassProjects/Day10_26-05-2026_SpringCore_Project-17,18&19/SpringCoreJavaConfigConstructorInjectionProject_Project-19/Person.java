package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private String name;
	private int age;
	private long mob_num;

	@Autowired
	private Passport pass;

	public Person(String name, int age, long mob_num, Passport pass) {
		this.name = name;
		this.age = age;
		this.mob_num = mob_num;
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", mob_num=" + mob_num + ", pass=" + pass + "]";
	}
}
