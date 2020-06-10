package com.aneesh.annotationsDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemo {

	public static void main(String[] args) {

		//read spring config file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		//get the bean from container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//call method on bean
		theCoach.getDailyWorkout();
		System.out.println(theCoach.getDailyFortune());
		
		theCoach.getDailyFortune();
		
		theCoach.getName();
		
		theCoach.getEmail();
		
		//close the container
		context.close();
	}

}
