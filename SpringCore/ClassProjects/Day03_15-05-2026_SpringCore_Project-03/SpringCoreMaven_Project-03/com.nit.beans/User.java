package com.nit.beans;

public class User {
	private int id;
	private String u_name;
	private String u_emil;
	private long u_mob_num;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_emil() {
		return u_emil;
	}

	public void setU_emil(String u_emil) {
		this.u_emil = u_emil;
	}

	public long getU_mob_num() {
		return u_mob_num;
	}

	public void setU_mob_num(long u_mob_num) {
		this.u_mob_num = u_mob_num;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", u_name=" + u_name + ", u_emil=" + u_emil + ", u_mob_num=" + u_mob_num + "]";
	}

	public void display() {
		IO.println("User Id is: " + id);
		IO.println("User Name is: " + u_name);
		IO.println("User Email is: " + u_emil);
		IO.println("User Mob_num is: " + u_mob_num);
	}
}
