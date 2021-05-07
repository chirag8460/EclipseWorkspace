package com.app.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load config
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from container
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		Coach theAlphaCoach=context.getBean("myCoach",Coach.class);
		
		//Singleton class use same reference of the object
		//on using prototype scope address of the object will be different
		//protoype create new reference for every new object
		
		boolean result=(theCoach==theAlphaCoach);
		System.out.println(result);
		System.out.println("Address of Coach :"+theCoach);
		System.out.println("Address of alpha coach : "+theAlphaCoach);
		
		context.close();
	}

}
