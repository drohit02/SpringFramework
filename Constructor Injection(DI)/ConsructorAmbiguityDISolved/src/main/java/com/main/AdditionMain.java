package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Addition;

public class AdditionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("Config file Bean1 without type speciftied");
		Addition add1 = (Addition)context.getBean("bean1");
		System.out.println(add1);
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("Config file Bean2 with type speciftied as int");
		Addition add2 = (Addition)context.getBean("bean2");
		System.out.println(add2);
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("Config file Bean1 with type speciftied as String");
		Addition add3 = (Addition)context.getBean("bean3");
		System.out.println(add3);
		System.out.println("----------------------------------------------------------------");

	}

}
