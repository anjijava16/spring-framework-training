package com.skbr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.skbr.Car.Engine;

public class StandaloneApplication {

	private static ApplicationContext applicationContext;
	
	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		instantiationWithConstructor();
		
		instantiationWithFactoryMethod();
	}
	private static void instantiationWithConstructor() {
		
		System.out.println(applicationContext.getBean(Car.class));
		System.out.println(applicationContext.getBean(Engine.class));
		System.out.println(applicationContext.getBean(Mobile.class));
	}

	private static void instantiationWithFactoryMethod() {
		
		instantiationWithStaticFactoryMethod();
		instantiationWithNonStaticFactoryMethod();
	}

	private static void instantiationWithStaticFactoryMethod() {
		System.out.println(applicationContext.getBean(Laptop.class));
		
	}
	private static void instantiationWithNonStaticFactoryMethod() {
		System.out.println(applicationContext.getBean(Desktop.class));
	}
}
