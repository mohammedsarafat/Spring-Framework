package com.nit.task04;

import java.util.Map;

public class DepartmentAllocation {
	private String universityName;
	private Map<String, String> departmentRooms;

	public DepartmentAllocation(String universityName, Map<String, String> departmentRooms) {
		super();
		this.universityName = universityName;
		this.departmentRooms = departmentRooms;
	}

	@Override
	public String toString() {
		return "DepartmentAllocation [universityName=" + universityName + ","
				+ " \ndepartmentRooms=" + departmentRooms 
				+ "]";
	}

}
