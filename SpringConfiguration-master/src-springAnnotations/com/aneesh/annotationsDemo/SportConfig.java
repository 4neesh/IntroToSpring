package com.aneesh.annotationsDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.aneesh.annotationsDemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	@Bean
	public SwimCoach swimCoach() {
		SwimCoach mySwimCoach = new SwimCoach(sadFortuneService());
		return mySwimCoach;
	}

	@Bean
	public fortuneService sadFortuneService() {
	return new SadFortuneService();
	}
	
}

