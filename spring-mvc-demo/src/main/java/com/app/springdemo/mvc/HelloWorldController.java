package com.app.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	
	//controller to show initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorld-form";
	}

	//mapping to form which will process the data
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}
	
	//new controller method
	//add data to the model
	@RequestMapping("/processForm-v2")
	public String capitalize(HttpServletRequest request,Model model)
	{
		//read data parameter from html
		String theName=request.getParameter("studentName");
		//capitalise the data
		theName=theName.toUpperCase();
		String msg=" Hello !! "+theName;
		//add to the model
		model.addAttribute("message",msg);
				
		return "helloWorld";
	}
	
	@RequestMapping("/processForm-v3")
	public String requestParam(@RequestParam("studentName") String theName,Model model)
	{
		//reading data using @RequestParam Annotation
		
		//capitalise the data
		theName=theName.toUpperCase();
		String msg=" Hello My friend v3 !! "+theName;
		//add to the model
		model.addAttribute("message",msg);
				
		return "helloWorld";
	}
	
	
}
