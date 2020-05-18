package com.lovecode.springdemo;

public class VoleyballCoach implements Coach {

	
	FortuneService fortuneService;
	
	public VoleyballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 60 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just DO It!!" +fortuneService.getFortune();
	}	
}
