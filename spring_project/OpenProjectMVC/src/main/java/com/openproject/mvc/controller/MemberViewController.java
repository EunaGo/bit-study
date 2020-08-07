package com.openproject.mvc.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.openproject.mvc.service.MemberViewService;

@Controller
public class MemberViewController {

	@Inject
	private MemberViewService viewService;
	
	// http://localhost:8080/mvc/member/view/12
	@RequestMapping("/member/view/{idx}")
	public String getMemberInfo(@PathVariable("idx") int idx, Model model) {
		System.out.println("idx확인하기>>>>>>>>>>>>>>>>"+idx);
		model.addAttribute("member",viewService.getMemberInfo(idx));
		
		
		return "member/memberView";
	}
}
