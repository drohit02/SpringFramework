package com.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeBean {
	
	private String empName;
	private List<String> phones;
	private Set<String> address;
	private Map<String,String> courses;
	
	
	public EmployeeBean() {
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeBean(String empName, List<String> phones, Set<String> address, Map<String, String> courses) {
		this.empName = empName;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "{empName=" + empName + ", \nphones=" + phones + ", \naddress=" + address + ", \ncourses="
				+ courses + "}";
	}
	

}
