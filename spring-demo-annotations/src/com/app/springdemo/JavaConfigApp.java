package com.app.springdemo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigApp {

	public static void main(String[] args) {
		//load config
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get bean using context
		Coach theCoach=context.getBean("cricketCoach",CricketCoach.class);
		Coach theAlphaCoach=context.getBean("cricketCoach",CricketCoach.class);
		
		//call method on object
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//comparing the object
		boolean result=(theAlphaCoach==theCoach);
		System.out.println("Result :"+result);
		
		//close context
		context.close();

	}

}
