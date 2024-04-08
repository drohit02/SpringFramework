package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.NormalBean;

public class ReferenceDIMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		NormalBean normalBean = (NormalBean)context.getBean("normalBean");
		
		System.out.println(normalBean);
	}

}
