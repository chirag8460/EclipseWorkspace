package com.app.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String team;
	public CricketCoach() {
	//	System.out.println("cricket cc");
	}
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		//System.out.println("cricket setter");

		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Dhoni in the match";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
