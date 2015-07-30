package com.skbr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.skbr.Datasource;

public class StandaloneApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
		
		System.out.println(applicationContext.getBean(Datasource.class));
		applicationContext.registerShutdownHook();
	}
}
