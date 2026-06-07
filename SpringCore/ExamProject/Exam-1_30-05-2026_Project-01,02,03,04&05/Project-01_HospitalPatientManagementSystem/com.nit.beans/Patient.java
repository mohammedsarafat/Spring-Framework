package com.nit.beans;

public class Patient {
	private int pId;
	private String pName;
	private String pDisease;

	private Doctor d;

	public Doctor getD() {
		return d;
	}

	public void setD(Doctor d) {
		this.d = d;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpDisease() {
		return pDisease;
	}

	public void setpDisease(String pDisease) {
		this.pDisease = pDisease;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	@Override
	public String toString() {
		return "Patient [pName=" + pName + ", pDisease=" + pDisease + ", pId=" + pId + "]";
	}

	public void display() {
		IO.println("Patient id is: " + pId);
		IO.println("Patient Name is: " + pName);
		IO.println("Patient Disease is: " + pDisease);
		IO.println("Patient Doctor is: " + d);
	}
}
