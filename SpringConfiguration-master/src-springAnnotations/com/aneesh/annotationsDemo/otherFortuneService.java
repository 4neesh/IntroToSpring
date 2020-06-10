package com.aneesh.annotationsDemo;

import org.springframework.stereotype.Component;

@Component
public class otherFortuneService implements fortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "other fortune Service";
	}

}
