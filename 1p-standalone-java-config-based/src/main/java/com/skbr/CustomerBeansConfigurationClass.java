package com.skbr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.skbr.beans.Mobile;

@Configuration
@ComponentScan("com.skbr.beans")
public class CustomerBeansConfigurationClass {

	@Bean
	public Mobile nokia() {
		return new Mobile();
	}
	@Bean
	public Mobile samsung() {
		return new Mobile();
	}
}
