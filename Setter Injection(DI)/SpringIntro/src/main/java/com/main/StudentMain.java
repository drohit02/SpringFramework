package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.StudentBean;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentBean obj = (StudentBean)context.getBean("studBean");
		System.out.println(obj);

	}

}
