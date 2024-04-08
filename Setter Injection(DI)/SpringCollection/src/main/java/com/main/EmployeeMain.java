package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.EmployeeBean;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		EmployeeBean obj = (EmployeeBean)context.getBean("emp1");
		System.out.println(obj);
	}

}
