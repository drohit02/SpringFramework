package com.beans;

public class Location {
	
	private String lane;
	private String city;

	public Location() {
		// TODO Auto-generated constructor stub
	}

	public Location(String lane, String city) {
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
		return "Location [lane=" + lane + ", city=" + city + "]";
	}
	
	
}
