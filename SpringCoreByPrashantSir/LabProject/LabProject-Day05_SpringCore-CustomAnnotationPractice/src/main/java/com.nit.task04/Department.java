package com.nit.task04;

public class Department {

    private String deptName;
    private String location;

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Department [deptName=" + deptName
                + ", location=" + location + "]";
    }
}
