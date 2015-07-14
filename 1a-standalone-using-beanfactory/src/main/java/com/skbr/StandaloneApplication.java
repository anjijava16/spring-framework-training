package com.skbr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class StandaloneApplication {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader((BeanDefinitionRegistry) beanFactory);
		xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
		
		MessageGenerator messageGenerator = beanFactory.getBean(MessageGenerator.class);

		System.out.println(messageGenerator.getMessage());
	}

}
