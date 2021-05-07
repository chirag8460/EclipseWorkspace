package com.app.springdemo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaConfigDemo {

	public static void main(String[] args) {
		//load config
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get bean using context
		SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);
		//Coach theAlphaCoach=context.getBean("cricketCoach",CricketCoach.class);
		
		//call method on object
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
	
		//call new methods
		System.out.println("email : "+theCoach.getEmail());
		System.out.println("Msg : "+theCoach.getMsg());
		
		//close context
		context.close();

	}

}
