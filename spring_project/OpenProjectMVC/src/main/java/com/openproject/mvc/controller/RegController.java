package com.openproject.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.openproject.mvc.model.RegRequest;
import com.openproject.mvc.service.RegService;


@Controller
@RequestMapping("/reg/reg")
public class RegController {
	
	@Autowired
	RegService regService;

	@RequestMapping(method = RequestMethod.GET)
	public String getRegForm() {
		return "reg/regForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String reg(
			HttpServletRequest request,
			RegRequest regRequest,
			Model model) {
		model.addAttribute("regRequest", regService.memberReg(regRequest,request));
		
		return "reg/reg";
	}
	
}
