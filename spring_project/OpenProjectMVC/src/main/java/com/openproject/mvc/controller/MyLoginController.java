package com.openproject.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.openproject.mvc.model.LoginRequest;

@Controller
@RequestMapping("/login/login")
public class MyLoginController {
	
	@RequestMapping
	public String getLoginForm() {
		return "login/loginForm";
		}
	
	@RequestMapping(method=RequestMethod.POST)
	public String login(HttpServletRequest request, @RequestParam("uid") String uid,
			@RequestParam("upw") String upw, @ModelAttribute("login") LoginRequest loginrequest){
		
		
		return "login/login";
	}
}
