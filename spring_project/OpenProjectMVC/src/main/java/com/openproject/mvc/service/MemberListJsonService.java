package com.openproject.mvc.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openproject.mvc.dao.MemberDaoInterface;
import com.openproject.mvc.model.Member;

@Service
public class MemberListJsonService {
	
	private MemberDaoInterface dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	public List<Member> getMemberList(){
		
		dao = template.getMapper(MemberDaoInterface.class);
		
		return dao.selectTotalList();
	}
	
}
