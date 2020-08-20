package com.aia.mm.service;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.mm.dao.MemberDao;

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
