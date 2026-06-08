package com.nit.beans;

public class DeliveryPartner {
	private int dpId;
	private String dpName;
	private long number;

	@Override
	public String toString() {
		return "DeliveryPartner [dpId=" + dpId + ", dpName=" + dpName + ", number=" + number + "]";
	}

	public DeliveryPartner(int dpId, String dpName, long number) {
		super();
		this.dpId = dpId;
		this.dpName = dpName;
		this.number = number;
	}

	public void display() {
		IO.println("DeliveryPartner Id is: " + dpId);
		IO.println("DeliveryPartner Company Name is: " + dpName);
		IO.println("DeliveryPartner Premium amount is: " + number);
	}
}
