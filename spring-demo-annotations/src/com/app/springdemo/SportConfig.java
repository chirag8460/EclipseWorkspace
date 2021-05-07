package com.app.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.app.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//define bean for badFortuneService
	@Bean
	public FortuneService badFortuneService() {
		return new BadFortuneService();
	}
	
	//define bean for swim coach and inject dependency	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(badFortuneService());
	}
		
	

}
