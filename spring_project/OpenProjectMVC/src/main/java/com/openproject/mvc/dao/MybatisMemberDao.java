package com.openproject.mvc.dao;

import java.sql.SQLException;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.openproject.mvc.model.Member;

@Repository
public class MybatisMemberDao {

	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	private String mapperPath = "com.openproject.mvc.mybatis.mapper.MemberMapper";

	public int insertMember(Member member) throws SQLException {

		return sessionTemplate.update(mapperPath +".insertMember", member);
	}
}
