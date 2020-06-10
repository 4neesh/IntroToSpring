package com.aneesh.annotationsDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemo {

	public static void main(String[] args) {

		//read spring config file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		//get the bean from container
		Coach theCoach = context.getBean("hockeyCoach", HockeyCoach.class);
		
		//call method on bean
		theCoach.getDailyWorkout();
		System.out.println(theCoach.getDailyFortune());
		
		theCoach.getName();
		//close the container
		context.close();
	}

}
