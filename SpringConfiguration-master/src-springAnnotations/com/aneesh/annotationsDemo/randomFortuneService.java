package com.aneesh.annotationsDemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class randomFortuneService implements fortuneService {

	private String[] data = {
			"abc", "def","ghi"
	};
	
	private Random myRandom = new Random();
	
	
	@Override
	public String getFortune() {

		int index = myRandom.nextInt(data.length);
		String fortune = data[index];
		return fortune;
	}

}
