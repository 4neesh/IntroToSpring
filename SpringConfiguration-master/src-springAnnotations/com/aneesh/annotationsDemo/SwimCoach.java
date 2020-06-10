package com.aneesh.annotationsDemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private fortuneService myFortuneService;
	
	@Value("${coach.email}")
	private String email;
	
	@Value("${coach.name}")
	private String name;
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return myFortuneService.getFortune();
	}

	@Override
	public void getDailyWorkout() {

System.out.println("Warm up with 10 lengths.");
	}

	@Override
	public void getName() {
		
		System.out.println("The name: " + this.name);

	}
	
	public void getEmail() {
		System.out.println("The email: " + this.email);
	}

	public SwimCoach(fortuneService myFortuneService){
		this.myFortuneService = myFortuneService;
	}
}
