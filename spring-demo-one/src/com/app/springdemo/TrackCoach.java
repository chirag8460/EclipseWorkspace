package com.app.springdemo;

public class TrackCoach implements Coach {
	
	//define a private field for dependency
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	//define a constructor for dependency injeciton
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "RUN 5 Kilometer";		
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It: "+fortuneService.getFortune();
		}

	public void initMethod() {
		System.out.println("Init Method Track Coach");
	}
	
	public void destroyMethod() {
		System.out.println("Destroy Method Track Coach");
	}


}
