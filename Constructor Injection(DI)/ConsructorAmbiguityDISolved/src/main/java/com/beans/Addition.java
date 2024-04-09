package com.beans;

public class Addition {

	int num1;
	int num2;
	
	public Addition(double num1, double num2) {
		this.num1 = (int)num1;
		this.num2 = (int)num2;
		System.out.println("Construtor Called with double and sum of number is : "+(num1+num2));
	}
	
	public Addition(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("Construtor Called with int and sum of number is : "+(num1+num2));
	}
	
	public Addition(String str1,String str2) {
		this.num1 = Integer.parseInt(str1);
		this.num2 = Integer.parseInt(str2);
		System.out.println("Construtor Called with String and sum of number is : "+(num1+num2));
	}
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}

	@Override
	public String toString() {
		return "Addition [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
	
}
