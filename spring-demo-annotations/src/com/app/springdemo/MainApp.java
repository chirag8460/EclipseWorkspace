package com.app.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		//read config 
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from string
		Coach coach=context.getBean("cricketCoach",Coach.class);
		
		//call method on bean
		System.out.println(coach.getDailyWorkout());
		
		//call new methods
		System.out.println(coach.getDailyFortune());
		//close context
		context.close();	}

}
