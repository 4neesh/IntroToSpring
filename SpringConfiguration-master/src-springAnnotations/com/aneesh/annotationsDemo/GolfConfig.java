package com.aneesh.annotationsDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.aneesh.annotationsDemo")
@PropertySource("classpath:sport.properties")
public class GolfConfig {
	
	@Bean
	public GolfCoach golfCoach() {
		GolfCoach myGolfCoach = new GolfCoach(sadFortuneService());
		return myGolfCoach;
	}

	@Bean
	public fortuneService sadFortuneService() {
	return new SadFortuneService();
	}
	
}

