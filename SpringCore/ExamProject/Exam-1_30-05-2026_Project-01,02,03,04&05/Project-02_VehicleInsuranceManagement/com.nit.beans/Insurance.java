package com.nit.beans;

public class Insurance {
	private int pId;
	private String cName;
	private double pAmt;

	public Insurance(int pId, String cName, double pAmt) {
		super();
		this.pId = pId;
		this.cName = cName;
		this.pAmt = pAmt;
	}

	@Override
	public String toString() {
		return "Insurance [pId=" + pId + ", cName=" + cName + ", pAmt=" + pAmt + "]";
	}

	public void display() {
		IO.println("Insurance Id is: " + pId);
		IO.println("Insurance Company Name is: " + cName);
		IO.println("Insurance Premium amount is: " + pAmt);
	}
}
