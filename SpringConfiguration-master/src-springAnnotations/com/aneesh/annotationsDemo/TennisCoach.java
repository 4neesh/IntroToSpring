package com.aneesh.annotationsDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private fortuneService myFortuneService;
	
	private String name;
	
	@Override
	public void getDailyWorkout() {

		System.out.println("Practice back-hand volley");
		
	}

	@Override
	public String getDailyFortune() {

		return myFortuneService.getFortune();
		}

	@Override
	public void getName() {
System.out.println("No name");;		
	}

}
