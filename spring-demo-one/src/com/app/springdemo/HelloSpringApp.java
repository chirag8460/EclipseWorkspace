package com.app.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load configuration
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");		
		//retrieve bean
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		//call method
		System.out.println(theCoach.getDailyWorkout());
		
		//method for fortune
		System.out.println(theCoach.getDailyFortune());
		
		
		//close context
		context.close();
		
		
	}
}
