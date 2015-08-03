package com.skbr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class StandaloneApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);

		PersonRepository personRepository = applicationContext.getBean(PersonRepository.class);
		
		System.out.println("Total number of persons: " + personRepository.countPersons());
		System.out.println("Find ross : " + personRepository.findByName("ross"));
		System.out.println("Find all : " + personRepository.findAll());
		
		personRepository.createPerson(new Person("chandler", 36));
		System.out.println("Find all : " + personRepository.findAll());

		applicationContext.registerShutdownHook();
	}
}
