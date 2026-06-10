package com.nit.beans;

public class Passport {
	private String p_name;
	private String p_num;
	private String country;

	public Passport(String p_name, String p_num, String country) {
		this.p_name = p_name;
		this.p_num = p_num;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Passport [p_name=" + p_name + ", p_num=" + p_num + ", country=" + country + "]";
	}
}
