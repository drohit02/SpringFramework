package com.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.EmployeeBean;

public class EmployeeMain {

	public static void main(String[] args) {
	
		//Autowire="byName" bean
		AbstractApplicationContext context  = new ClassPathXmlApplicationContext("config.xml");
		
		EmployeeBean obj = (EmployeeBean)context.getBean("empBean1");
		System.out.println(obj);
		
		//Autowire="byType" bean
		//	EmployeeBean obj1 = (EmployeeBean)context.getBean("empBean2");
		//	System.out.println(obj1);
		
		//AutoWire = "constructor" bean
		EmployeeBean obj2 = (EmployeeBean)context.getBean("empBean3");
		System.out.println(obj2);
	}

}
