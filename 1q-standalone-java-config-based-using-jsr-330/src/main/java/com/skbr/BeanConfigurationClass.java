package com.skbr;

import javax.inject.Named;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Scope;

import com.skbr.beans.Battery;
import com.skbr.beans.Mobile;

@Configuration
public class BeanConfigurationClass {
	

	@Bean (name = "nokia", initMethod = "init")
	@Scope(value="prototype")
	public Mobile mobile() {
		return new Mobile();
	}
	
	@Bean (name = "lithium", destroyMethod = "destroy")
	@Scope(value="singleton")
	@Description(value="This is a lithium battery to be used for mobiles")
	public Battery battery() {
		return new Battery();
	}
}
