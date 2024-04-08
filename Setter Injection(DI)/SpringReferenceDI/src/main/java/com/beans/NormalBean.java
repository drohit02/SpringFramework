package com.beans;

public class NormalBean {

	private int id;
	private String name;
	private ReferenceBean refObj;
	
	public NormalBean() {
		// TODO Auto-generated constructor stub
	}

	public NormalBean(int id, String name, ReferenceBean ref) {
		this.id = id;
		this.name = name;
		this.refObj = ref;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ReferenceBean getRef() {
		return refObj;
	}

	public void setRefObj(ReferenceBean ref) {
		this.refObj = ref;
	}

	@Override
	public String toString() {
		return "{id=" + id + ", name=" + name + ", refObj=" + refObj + "}";
	}
}
