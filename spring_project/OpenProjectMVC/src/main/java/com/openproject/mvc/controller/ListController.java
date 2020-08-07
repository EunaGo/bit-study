package com.openproject.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.openproject.mvc.model.Member;
import com.openproject.mvc.model.MemberXML;
import com.openproject.mvc.model.MemberXmlList;
import com.openproject.mvc.service.ListService;
import com.openproject.mvc.service.MemberListJsonService;
import com.openproject.mvc.service.MemberListXmlService;


@Controller
public class ListController {
	
	@Autowired
	ListService listService;
	
	@Autowired
	MemberListXmlService xmlService;
	
	@Autowired
	MemberListJsonService jsonService;
	
	@RequestMapping("/member/memberList")
	public String memberList(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		model.addAttribute("memberList", listService.memberList(request, response));
		
		return "member/memberList";
	}
	
	@RequestMapping("/member/memberList.xml")
	@ResponseBody
	public MemberXmlList getMemberXml() {
		
		return xmlService.getXmlList();
	}
	
	@RequestMapping("/member/memberList.json")
	@ResponseBody
	public List<Member> getMemberJson(){
		
		return jsonService.getMemberList();
	}
	
}
