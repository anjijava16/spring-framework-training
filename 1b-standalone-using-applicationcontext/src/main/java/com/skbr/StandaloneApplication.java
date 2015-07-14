package com.skbr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandaloneApplication {

	public static void main(String[] args) {
		

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		MessageGenerator messageGenerator = applicationContext.getBean(MessageGenerator.class);

		System.out.println(messageGenerator.getMessage());
	}

}
