package com.app.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {	
	
	private FortuneService fortuneService;
	
	@Value("${email}")
	private String email;
	@Value("${msg}")
	private String msg;
	
	
	
	public String getEmail() {
		return email;
	}
	public String getMsg() {
		return msg;
	}
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Swim 3 full laps of the Swimming pool";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
