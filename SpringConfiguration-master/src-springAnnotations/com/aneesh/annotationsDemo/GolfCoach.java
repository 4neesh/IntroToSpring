package com.aneesh.annotationsDemo;

import org.springframework.beans.factory.annotation.Value;

public class GolfCoach implements Coach {

	private fortuneService myFortuneService;
	
	@Value("${coach.email2}")
	public String email;
	
	
	public GolfCoach(fortuneService theFortuneService) {
		myFortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return myFortuneService.getFortune();
	}

	@Override
	public void getDailyWorkout() {

		System.out.println("Do 10 three foot putts");
		
	}

	@Override
	public void getName() {
			
		System.out.println("Golf coach is George Gankas");

	}
	
	public void getEmail() {
		System.out.println("Email George on: " +email);
	}

}
