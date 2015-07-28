package com.skbr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CallbackWithJSR250 {
	
	@PostConstruct
	public void startup() {
		System.out.println("Inside CallbackWithJSR250.startup");	
		
	}

	@PreDestroy
	public void shutdown() {
		System.out.println("Inside CallbackWithJSR250.shutdown");
		
	}
}
