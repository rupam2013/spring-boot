package com.spring.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ErrorController {
	
	@RequestMapping("/error")
	public ModelAndView index()
	{
		return(new ModelAndView("error"));
	}

}
