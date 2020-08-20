package com.openproject.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.openproject.mvc.model.LoginRequest;
import com.openproject.mvc.service.LoginService;

@Controller
@RequestMapping("/login/login")
public class MyLoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping
	public String getLoginForm() {
		return "login/loginForm";
		}
	
	@RequestMapping(method = RequestMethod.POST)
	public String login(
			LoginRequest loginRequest,
			HttpSession session,
			HttpServletResponse response,
			Model model
			) {
		
		model.addAttribute("result", loginService.login(loginRequest, session, response));
		
		
		return "login/login";
	}
}
