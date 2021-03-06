package com.app.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	
	private String lastName;
	
	private String country;
	private LinkedHashMap<String ,String> countryOptions;
	private String language;
	private LinkedHashMap<String ,String> languageOptions;
	private String operatingSystem;
	private LinkedHashMap<String,String> operatingSystemOptions;
	

	public Student() {
		//populate country option for student-form
		countryOptions=new LinkedHashMap<>();
		countryOptions.put("BR","Brazil");
		countryOptions.put("FR","France");
		countryOptions.put("DE","Germany");
		countryOptions.put("IN","India");
		
		languageOptions=new LinkedHashMap<>();
		languageOptions.put("Java","Java");
		languageOptions.put("PHP","PHP");
		languageOptions.put("Python","Python");
		languageOptions.put("Perl","Perl");
		
		operatingSystemOptions=new LinkedHashMap<>();
		operatingSystemOptions.put("Windows","Windows");
		operatingSystemOptions.put("Mac","Mac");
		operatingSystemOptions.put("Linux","Linux");
		operatingSystemOptions.put("Android","Android");
		
	}
	


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public LinkedHashMap<String, String> getLanguageOptions() {
		return languageOptions;
	}

	
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public LinkedHashMap<String, String> getOperatingSystemOptions() {
		return operatingSystemOptions;
	}


	
	
}
