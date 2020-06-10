package com.aneesh.annotationsDemo;

import org.springframework.stereotype.Component;

@Component
public class happyFortuneService implements fortuneService {

	@Override
	public String getFortune() {

		return "Today is your lucky day";
	}

}
