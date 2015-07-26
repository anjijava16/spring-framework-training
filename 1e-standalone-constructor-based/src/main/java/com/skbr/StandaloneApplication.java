package com.skbr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandaloneApplication {

	private static ApplicationContext applicationContext;
	
	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		dependencyInjectionViaConstructor();
	}

	private static void dependencyInjectionViaConstructor() {
		dependencyInjectionViaConstructorWithoutAmbiguity();
		dependencyInjectionViaConstructorResolutionByType();
		dependencyInjectionViaConstructorResolutionByIndex();
		dependencyInjectionViaConstructorResolutionByName();
	}

	private static void dependencyInjectionViaConstructorWithoutAmbiguity() {
		Mobile mobile = (Mobile) applicationContext.getBean("nokiaBlackMobile");
		System.out.println(mobile);
	}
	private static void dependencyInjectionViaConstructorResolutionByType() {
		Mobile mobile = (Mobile) applicationContext.getBean("samsungRedMobile");
		System.out.println(mobile);
	}
	private static void dependencyInjectionViaConstructorResolutionByIndex() {
		Mobile mobile = (Mobile) applicationContext.getBean("nokiaRedMobile");
		System.out.println(mobile);
	}
	private static void dependencyInjectionViaConstructorResolutionByName() {
		Mobile mobile = (Mobile) applicationContext.getBean("samsungBlackMobile");
		System.out.println(mobile);
	}
}
