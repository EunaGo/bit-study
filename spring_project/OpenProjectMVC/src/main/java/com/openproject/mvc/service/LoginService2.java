package com.openproject.mvc.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.openproject.mvc.dao.MemberDaoInterface;

public class LoginService2 {
	
	private MemberDaoInterface dao;
	
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	public String login() {
		
		dao=sessionTemplate.getMapper(MemberDaoInterface.class);
		return "";
	}
	
}
