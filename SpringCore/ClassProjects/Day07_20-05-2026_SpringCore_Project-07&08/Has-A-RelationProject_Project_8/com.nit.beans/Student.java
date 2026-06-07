package com.nit.beans;

public class Student {

    private int studentId;
    private String studentName;
    private String studentCourse;
    private double studentFees;

    

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public void setStudentFees(double studentFees) {
        this.studentFees = studentFees;
    }

    

    public void display() {

        System.out.println(
            "Student Id : " + studentId);

        System.out.println(
            "Student Name : " + studentName);

        System.out.println(
            "Student Course : " + studentCourse);

        System.out.println(
            "Student Fees : " + studentFees);

        System.out.println(
            "-------------------------");
    }

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCourse=" + studentCourse
				+ ", studentFees=" + studentFees + "]";
	}
    
    
}
