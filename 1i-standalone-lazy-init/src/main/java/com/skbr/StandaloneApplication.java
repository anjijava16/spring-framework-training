package com.skbr;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandaloneApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

		Map<String, Object> map = applicationContext.getBeansOfType(Object.class);
		for (Map.Entry<String, Object> bean : map.entrySet())
			System.out.println(bean);

		//System.out.println(applicationContext.getBean(Teacher.class));
	}
}
