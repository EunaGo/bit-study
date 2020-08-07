package com.openproject.mvc.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openproject.mvc.dao.MemberDaoInterface;
import com.openproject.mvc.model.Member;

@Service
public class MemberViewService {
	
	private MemberDaoInterface dao;
	
	@Autowired
	private SqlSessionTemplate sessionTemplate;

	public Member getMemberInfo(int idx) {
		
		dao = sessionTemplate.getMapper(MemberDaoInterface.class);
		
		return dao.selectByIdx(idx);
		
	}
}
