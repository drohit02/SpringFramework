package com.beans;

public class ItemBean {

	private int price;
	private String name;
	private String location;
	
	public ItemBean() {
		// TODO Auto-generated constructor stub
	}

	public ItemBean(int price, String name, String location) {
		this.price = price;
		this.name = name;
		this.location = location;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setter Injection called");
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "ItemBean [price=" + price + ", name=" + name + ", location=" + location + "]";
	}
	
	public void init() {
		System.out.println("Called init() method by Spring");
	}
	
	public void destroy() {
		System.out.println("Called destroy() method by Spring");
	}
	
	
	
	
}
