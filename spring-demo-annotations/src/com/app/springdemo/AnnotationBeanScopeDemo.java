package com.app.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationBeanScopeDemo {

	public static void main(String[] args) {
		//load config
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean using context
		Coach theCoach=context.getBean("cricketCoach",CricketCoach.class);
		Coach theAlphaCoach=context.getBean("cricketCoach",CricketCoach.class);
		
		//call method on object
		
		//comparing the object
		boolean result=(theAlphaCoach==theCoach);
		System.out.println("Result :"+result);
		
		//close context
		context.close();

	}

}
