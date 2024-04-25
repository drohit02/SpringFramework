package com.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeBean {

	private int empId;
	private String empName;
	private String empAddress;
	
	@Autowired
	private Location localAddress;
	
	public EmployeeBean() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeBean(int empId, String empName, String empAddress, Location localAddress) {
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.localAddress = localAddress;
	}

	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress
				+ ", localAddress=" + localAddress + "]";
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

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public Location getLocalAddress() {
		return localAddress;
	}

	public void setLocalAddress(Location localAddress) {
		this.localAddress = localAddress;
	}

		
}
