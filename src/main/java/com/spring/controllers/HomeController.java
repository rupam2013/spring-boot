package com.spring.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String index()
	{
		return("<center><h1>Welcome to Spring Boot !<h1><center>");
	}
	
	@RequestMapping("/home")
	public ModelAndView home()
	{
		return(new ModelAndView("home"));
	}

}
