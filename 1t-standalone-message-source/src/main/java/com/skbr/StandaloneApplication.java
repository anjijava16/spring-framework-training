package com.skbr;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StandaloneApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		MessageSource messageSource = new AnnotationConfigApplicationContext(BeanConfig.class);
		System.out.println(messageSource.getMessage("message", null, null));
	}
}
