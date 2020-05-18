package com.lovecode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//create a Spring container
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext.xml");
	
		//retrieve bean from spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		//Let's call our new method for Fortune

		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		
		context.close();

	}

}



















