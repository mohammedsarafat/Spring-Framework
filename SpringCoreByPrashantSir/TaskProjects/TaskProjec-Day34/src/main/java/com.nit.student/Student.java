package com.nit.student;

public class Student {

	private Integer studentId;
	private String studentName;
	private String course;
	private Double fees;

	public Student() {

	}

	public Student(Integer studentId, String studentName, String course, Double fees) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
		this.fees = fees;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Double getFees() {
		return fees;
	}

	public void setFees(Double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", course=" + course + ", fees="
				+ fees + "]";
	}
}

