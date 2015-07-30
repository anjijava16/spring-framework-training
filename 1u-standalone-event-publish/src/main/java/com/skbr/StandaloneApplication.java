package com.skbr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class StandaloneApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
		applicationContext.stop();
		applicationContext.registerShutdownHook();
	}
}
