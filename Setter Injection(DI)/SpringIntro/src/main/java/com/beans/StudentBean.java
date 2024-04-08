package com.beans;

public class StudentBean {
	
	private int studId;
	private String studName;
	private int marks;
	
	public StudentBean() {
		// TODO Auto-generated constructor stub
	}

	public StudentBean(int studId, String studName, int marks) {
		this.studId = studId;
		this.studName = studName;
		this.marks = marks;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "{studId=" + studId + ", studName=" + studName + ", marks=" + marks + "}";
	}
	
}
