package com.beans;

public class EmployeeBean {
	
	private int empId;
	private String empName;
	private Address empAddress;
	
	public EmployeeBean(int empId, String empName, Address empAddress) {
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	
	public EmployeeBean() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + "]";
	}

	
	
	
	
	

}
