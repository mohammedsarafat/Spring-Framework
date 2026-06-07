package com.nit.beans;

public class Sim {
	private int s_id;
	private String s_type;
	private double s_price;

	public Sim(int s_id, String s_type, double s_price) {
		super();
		this.s_id = s_id;
		this.s_type = s_type;
		this.s_price = s_price;
	}

	@Override
	public String toString() {
		return "Sim [s_id=" + s_id + ", s_type=" + s_type + ", s_price=" + s_price + "]";
	}

}
