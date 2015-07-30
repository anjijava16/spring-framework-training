package com.skbr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.skbr.beans.Mobile;

public class StandaloneApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfigurationClass.class);
		
		System.out.println(applicationContext.getBean(Mobile.class));
		applicationContext.registerShutdownHook();
	}
}
