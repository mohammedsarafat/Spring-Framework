package com.nit.beans;

public class Mobile {
	private String m_name;
	private String m_model;
	private double m_price;
	private String color;

	private Sim s;

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_model() {
		return m_model;
	}

	public void setM_model(String m_model) {
		this.m_model = m_model;
	}

	public double getM_price() {
		return m_price;
	}

	public void setM_price(double m_price) {
		this.m_price = m_price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Sim getS() {
		return s;
	}

	public void setS(Sim s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "Mobile [m_name=" + m_name + ", m_model=" + m_model + ", m_price=" + m_price + ", color=" + color
				+ ", s=" + s + "]";
	}

	public void display() {
		IO.println("Mobile Name is: " + m_name);
		IO.println("Mobile Model is: " + m_model);
		IO.println("Mobile Price is: " + m_price);
		IO.println("Mobile Color is: " + color);
		IO.println("Mobile Sim is: " + s);
	}
}
