package com.skbr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value="classpath:database.properties")
public class BeanConfig {
	
	@Autowired
	private ApplicationContext applicationContext;

	@Bean
	Datasource datasource() {
		Datasource datasource = new Datasource();
		datasource.setDatabase(applicationContext.getEnvironment().getProperty("database.name"));
		return datasource;
	}
}
