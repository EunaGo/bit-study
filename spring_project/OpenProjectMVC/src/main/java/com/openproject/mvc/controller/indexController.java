package com.openproject.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

	@RequestMapping("/index")
	public String index() {
		
		String str = null;
		str.toString();
		return "index";
		
	}
	
	@ExceptionHandler(NullPointerException.class)
	public String handleNullPointerException(NullPointerException e) {
		
		e.printStackTrace();
		
		return "error/nullPointer";
	}
}
