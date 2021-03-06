package com.app.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cricketCoach")
public class CricketCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
		
	//default constructor
	 public CricketCoach() {
		System.out.println("cricket coach default constructor");
	}
	 
	 //init method using annotation
	 @PostConstruct
	 public void intTasks() {
		 System.out.println("Intialized");
		 
	 }
	 //destroy method using annotation
	 @PreDestroy
	 public void destroyTask() {
		 System.out.println("Released");

	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 /*

	 @Autowired
	 //setter method defined
	 public void anyMethodName(FortuneService fortuneService) {
			System.out.println("setfortuneservice() setter method");
			this.fortuneService = fortuneService;
		}	 
	 */
	 
	 /*
	//constructor injection	 
		@Autowired
		public  CricketCoach(@Qualifier("randomFortuneService")FortuneService theFortuneService) {
			fortuneService=theFortuneService;
		}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice Fast Bowling ";		
		
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
