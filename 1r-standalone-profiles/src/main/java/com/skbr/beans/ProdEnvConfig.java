package com.skbr.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value="prod")
public class ProdEnvConfig {

	@Bean
	Datasource datasource() {
		return new ProdEnvDatasource();
	}
}
