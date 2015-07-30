package com.skbr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.skbr.beans.Datasource;
import com.skbr.beans.DevEnvConfig;
import com.skbr.beans.ProdEnvConfig;

public class StandaloneApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.getEnvironment().setActiveProfiles("dev");
		applicationContext.register(DevEnvConfig.class, ProdEnvConfig.class);
		applicationContext.refresh();
		
		System.out.println(applicationContext.getBean(Datasource.class));
		applicationContext.registerShutdownHook();
	}
}
