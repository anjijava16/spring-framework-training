package com.skbr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandaloneApplication {

	
	public static void main(String[] args) {
		dependencyInjectionUsingValue();
		
		dependencyInjectionUsingRefAndParent();
	}

	private static void dependencyInjectionUsingValue() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Watch titan = (Watch) applicationContext.getBean("titanWatch");
		System.out.println(titan);
		
		Watch timex = (Watch) applicationContext.getBean("timexWatch");
		System.out.println(timex);
		
	}

	private static void dependencyInjectionUsingRefAndParent() {
		ApplicationContext parent = new ClassPathXmlApplicationContext("parent-container-beans.xml");
		ApplicationContext child = new ClassPathXmlApplicationContext(new String[]{"child-container-beans.xml"}, parent);

		System.out.println(child.getBean(WatchCatalogue.class));
	}
}
