package com.skbr.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value="dev")
public class DevEnvConfig {

	@Bean
	Datasource datasource() {
		return new DevEnvDatasource();
	}
}
