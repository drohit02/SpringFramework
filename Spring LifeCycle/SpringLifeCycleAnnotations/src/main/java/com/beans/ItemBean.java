package com.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ItemBean {

	private String name;
	private int price;
	
	public ItemBean() {
		// TODO Auto-generated constructor stub
	}

	public ItemBean(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ItemBean [name=" + name + ", price=" + price + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init() method after setter injection");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy() method : removed bean from the container");
	}
}
