package com.aneesh.annotationsDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotationScopeDemo {

	public static void main(String[] args) {

		
	//read in context file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContextAn.xml");
		
	//retrieve beans from container
	Coach theCoach = context.getBean("tennisCoach", TennisCoach.class);
	Coach secondCoach = context.getBean("tennisCoach", TennisCoach.class);
	
	
	//test for equality
	System.out.println("Test for equality: " + (theCoach==secondCoach));
	//close the context file
	}

}
