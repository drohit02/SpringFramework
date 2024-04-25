package com.beans;

public class Address {
	
	private String lane;
	private String city;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String lane, String city) {
		this.lane = lane;
		this.city = city;
	}

	public String getLane() {
		return lane;
	}

	public void setLane(String lane) {
		this.lane = lane;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "{lane=" + this.lane + ", city=" + this.city + "}";
	}
	
	
}
