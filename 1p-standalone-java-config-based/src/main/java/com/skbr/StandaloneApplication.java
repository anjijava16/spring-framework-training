package com.skbr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.skbr.beans.CustomerDetailsController;

public class StandaloneApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(CustomerBeansConfigurationClass.class);
		
		System.out.println(applicationContext.getBean(CustomerDetailsController.class));
		System.out.println(applicationContext.getBean("scientific"));
		System.out.println(applicationContext.getBean("nokia"));
		applicationContext.registerShutdownHook();
	}
}
