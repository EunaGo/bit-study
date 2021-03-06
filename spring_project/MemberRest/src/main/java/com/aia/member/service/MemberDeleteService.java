package com.aia.member.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.member.dao.MemberDao;



@Service
public class MemberDeleteService {

	private MemberDao dao;
	
	@Autowired
	SqlSessionTemplate template;
	
	public int deleteMember(int idx) {
	
		dao = template.getMapper(MemberDao.class);
		
		int result = 0;
				
		result = dao.deleteMember(idx);
		
		return result;
	}
}
