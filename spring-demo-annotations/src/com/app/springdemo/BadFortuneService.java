package com.app.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today you are going to get destroyed by the other team";
	}

}
