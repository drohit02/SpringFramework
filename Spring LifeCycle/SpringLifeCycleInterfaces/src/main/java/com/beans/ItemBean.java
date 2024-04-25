package com.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ItemBean implements InitializingBean,DisposableBean{

	private String name;
	private int price;
	private String taste;
	
	public ItemBean() {
		// TODO Auto-generated constructor stub
	} 

	public ItemBean(String name, int price, String taste) {
		this.name = name;
		this.price = price;
		this.taste = taste;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setter Injecton called...");
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	@Override
	public String toString() {
		return "ItemBean [name=" + name + ", price=" + price + ", taste=" + taste + "]";
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("LifeCycle Bean : Destoy() Called");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("LifeCycle Bean : Init() called");
	}
	
}
