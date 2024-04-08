package com.beans;

public class ReferenceBean {

	
	private int refId;
	private String refName;
	
	public ReferenceBean() {
		// TODO Auto-generated constructor stub
	}

	public ReferenceBean(int refId, String refName) {
		this.refId = refId;
		this.refName = refName;
	}

	public int getRefId() {
		return refId;
	}

	public void setRefId(int refId) {
		this.refId = refId;
	}

	public String getRefName() {
		return refName;
	}

	public void setRefName(String refName) {
		this.refName = refName;
	}

	@Override
	public String toString() {
		return "{refId=" + refId + ", refName=" + refName + "}";
	}
	
}
