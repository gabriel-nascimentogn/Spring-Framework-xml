package com.lovecode.springdemo;

public class BaseballCoach implements Coach {
	
	
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	
	//create a constructor in your class for injections
	// define a constructor for dependency injection
	public BaseballCoach (FortuneService theFortuneService) {
		fortuneService = theFortuneService;
		
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
		
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();	// use my fortuneService to get a fortune
		
	}
}
