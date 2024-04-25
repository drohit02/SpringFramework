package com.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.ItemBean;

public class ItemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		ItemBean obj = (ItemBean)context.getBean("item1");
		System.out.println(obj);
		
		//registerShutdownHook() : Method present in AbstractApplicationContext Interface
		context.registerShutdownHook();
	
	}
 
}
