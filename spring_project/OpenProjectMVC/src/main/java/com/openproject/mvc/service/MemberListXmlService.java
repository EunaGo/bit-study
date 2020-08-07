package com.openproject.mvc.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openproject.mvc.dao.MemberDaoInterface;
import com.openproject.mvc.model.MemberXML;
import com.openproject.mvc.model.MemberXmlList;

@Service
public class MemberListXmlService {

	private MemberDaoInterface dao;

	@Autowired
	private SqlSessionTemplate sessionTemplate;

	public MemberXmlList getXmlList() {

		dao = sessionTemplate.getMapper(MemberDaoInterface.class);

		List<MemberXML> memberList = dao.selectTotalListXml();

		MemberXmlList list = new MemberXmlList(memberList);

		return list;
		// return new MemberXmlList(dao.selectTotalListXml());

	}

}
