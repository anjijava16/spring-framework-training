package com.skbr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CallbackWithAllMechanism implements InitializingBean, DisposableBean{
	
	public void init() {
		System.out.println("Inside CallbackWithAllMechanism.init");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Inside CallbackWithAllMechanism.postConstruct");
	}
	
	public void cleanup() {
		System.out.println("Inside CallbackWithAllMechanism.cleanup");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Inside CallbackWithAllMechanism.preDestroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside CallbackWithAllMechanism.afterPropertiesSet");
		
	}

	@Override
	public void destroy() throws Exception {
		 System.out.println("Inside CallbackWithAllMechanism.destroy");
		
	}

}
