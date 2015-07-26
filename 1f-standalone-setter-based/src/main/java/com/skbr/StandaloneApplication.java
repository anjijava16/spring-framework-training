package com.skbr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandaloneApplication {

	private static ApplicationContext applicationContext;
	
	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		dependencyInjectionViaSetter();
	}

	private static void dependencyInjectionViaSetter() {
		Pizza pizza = applicationContext.getBean(Pizza.class);
		System.out.println(pizza);
	}
}
