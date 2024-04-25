package com.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.EmployeeBean;

public class EmployeeMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		EmployeeBean obj = context.getBean("emp",EmployeeBean.class);
		System.out.println(obj);
	}
}
