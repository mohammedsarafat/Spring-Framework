package com.nit.task01;

import java.util.Map;

public class MedicineInventory 
{
    private String pharmacyName;
    private Map<String, Integer> medicineStock;
    
	public String getPharmacyName() {
		return pharmacyName;
	}
	public void setPharmacyName(String pharmacyName) {
		this.pharmacyName = pharmacyName;
	}
	public Map<String, Integer> getMedicineStock() {
		return medicineStock;
	}
	public void setMedicineStock(Map<String, Integer> medicineStock) {
		this.medicineStock = medicineStock;
	}
	@Override
	public String toString() {
		return "MedicineInventory [pharmacyName=" + pharmacyName + ", medicineStock=" + medicineStock + "]";
	}
    
    
}
