package com.aneesh.annotationsDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HockeyCoach implements Coach {

	@Value("${coaches.name}")
	String name;
	
	
	private fortuneService myFortuneService;
	
	HockeyCoach(){
		System.out.println("Creating the hockey Coach");
	}
	
	@PostConstruct
	public void creatingHockey() {
		System.out.println("Creating the hockey coach in postconstruct");
	}
	
	@PreDestroy
	public void destroyCoach() {
		System.out.println("About to destroy the coach");
	}
	
	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(fortuneService thisFortuneService) {
		System.out.println("Setting fortune service");
		this.myFortuneService = thisFortuneService;
	}
	
	
	
	@Override
	public String getDailyFortune() {
		return myFortuneService.getFortune();
	}

	@Override
	public void getDailyWorkout() {

		System.out.println("Do 10 laps of hockey pitch");
	}

	@Override
	public void getName() {
System.out.println("The name: " + name);		
	}

}
