package com.app.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//create an array of random fortune string
	private String[] data= {"An Apple a day keeps a doctor away","Burned by butter milk, Drinks milk after Audit","All thiefs are cousins"};
	
	//random number generator	
	private Random myRandom=new Random();
	
	
	@Override
	public String getFortune() {
		//pick a random string and return
		int index=myRandom.nextInt(data.length);
		return data[index];
	}
	
	

}
