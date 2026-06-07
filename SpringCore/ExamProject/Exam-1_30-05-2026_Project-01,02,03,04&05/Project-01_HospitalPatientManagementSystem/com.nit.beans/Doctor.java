package com.nit.beans;

public class Doctor {
	private int dId;
	private String dName;
	private String dSpecial;

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getdSpecial() {
		return dSpecial;
	}

	public void setdSpecial(String dSpecial) {
		this.dSpecial = dSpecial;
	}

	
	@Override
	public String toString() {
		return "Doctor [dId=" + dId + ", dName=" + dName + ", dSpecial=" + dSpecial + "]";
	}

	public void display() {
		IO.println("Doctor Id is: " + dId);
		IO.println("Doctor Name is: " + dName);
		IO.println("Doctor Price is: " + dSpecial);
	}
}
