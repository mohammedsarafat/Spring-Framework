package com.nit.beans;

public class Order {
	private int oId;
	private String pName;
	private String oAmt;

	private DeliveryPartner d;

	public int getoId() {
		return oId;
	}

	public void setoId(int oId) {
		this.oId = oId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getoAmt() {
		return oAmt;
	}

	public void setoAmt(String oAmt) {
		this.oAmt = oAmt;
	}

	public DeliveryPartner getD() {
		return d;
	}

	public void setD(DeliveryPartner d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Order [oId=" + oId + ", pName=" + pName + ", oAmt=" + oAmt + ", d=" + d + "]";
	}

	public void display() {
		IO.println("Order Id is: " + oId);
		IO.println("Order Name is: " + pName);
		IO.println("Order Amount is: " + oAmt);
		IO.println("Order DeliveryPartner is: " + d);
	}
}
