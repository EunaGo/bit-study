package com.openproject.mvc.controller;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.openproject.mvc.model.RegRequest;
import com.openproject.mvc.service.RegService;
import com.openproject.mvc.util.AES256Util;
import com.openproject.mvc.util.Sha256;


@Controller
@RequestMapping("/reg/reg")
public class RegController {
	
	@Autowired
	RegService regService;
	
	@Autowired
	private Sha256 sha256;
	
	@Autowired
	private AES256Util aes256Util;
	
//	@Autowired
//	private BCryptPasswordEncoder PasswordEncoder ;

	@RequestMapping(method = RequestMethod.GET)
	public String getRegForm() {
		return "reg/regForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String reg(HttpServletRequest request, RegRequest regRequest, Model model) throws NoSuchAlgorithmException, UnsupportedEncodingException, GeneralSecurityException {
		
		System.out.println("SHA암호화");
		System.out.println(sha256.encrypt(regRequest.getUpw()));
		System.out.println(sha256.encrypt(regRequest.getUpw()).length());
		
		System.out.println("----------------------------------------------");
		
		System.out.println("AES암호화");
		System.out.println(aes256Util.encrypt(regRequest.getUpw()));
		System.out.println(aes256Util.encrypt(regRequest.getUpw()).length());
		
		System.out.println("----------------------------------------------");
		System.out.println("Spring Security 암호화");
//		System.out.println(PasswordEncoder.encode(regRequest.getUpw()));
//		System.out.println(PasswordEncoder.encode(regRequest.getUpw()).length());
		
		model.addAttribute("regRequest", regService.memberReg(regRequest,request));
		
		return "reg/reg";
	}
	
}
