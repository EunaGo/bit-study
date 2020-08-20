package com.openproject.mvc.service;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openproject.mvc.dao.MemberDaoInterface;
import com.openproject.mvc.model.LoginRequest;
import com.openproject.mvc.model.Member;

@Service
public class LoginService {

//	@Autowired
//	MemberDao dao;
	private MemberDaoInterface dao;

	@Autowired
	private SqlSessionTemplate sessionTemplate;

	public String login(LoginRequest loginRequest, HttpSession session, HttpServletResponse response) {

		// inteface의 Mapper 객체 생성
		dao = sessionTemplate.getMapper(MemberDaoInterface.class);

		String loginResult = "";

		// 로그인 처리
		Member member = null;

		member = dao.selectById(loginRequest.getUid(), loginRequest.getUpw());

		System.out.println("LoginService Member : " + member);

		if (member != null) {

			LoginRequest loginInfo = new LoginRequest(member.getUid(), member.getUname(), member.getUphoto());

			session.setAttribute("loginInfo", loginInfo);
			System.out.println("logininfo>>>>>>>>>>>>>>>>>"+loginInfo);

		}
		return loginResult;
	}
}