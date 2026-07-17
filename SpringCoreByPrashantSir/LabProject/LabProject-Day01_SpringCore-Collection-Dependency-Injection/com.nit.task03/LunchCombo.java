package com.nit.task03;

import java.util.List;

public class LunchCombo {
	private String comboName;
	private List<String> foodItems;

	public LunchCombo(String comboName, List<String> foodItems) {
		super();
		this.comboName = comboName;
		this.foodItems = foodItems;
	}

	@Override
	public String toString() {
		return "LunchCombo [comboName=" + comboName + ", foodItems=" + foodItems + "]";
	}

}
