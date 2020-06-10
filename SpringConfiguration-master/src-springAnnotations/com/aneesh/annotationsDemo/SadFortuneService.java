package com.aneesh.annotationsDemo;

public class SadFortuneService implements fortuneService {

	@Override
	public String getFortune() {

		return "Today is not your lucky day";
	}

}
