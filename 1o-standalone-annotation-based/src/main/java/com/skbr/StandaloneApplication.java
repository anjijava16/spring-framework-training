package com.skbr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandaloneApplication {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println(applicationContext.getBean(Car.class));
		System.out.println(applicationContext.getBean(Mobile.class));
		
		applicationContext.registerShutdownHook();
	}
}
