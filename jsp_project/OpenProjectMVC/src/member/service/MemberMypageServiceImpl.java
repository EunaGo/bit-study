package member.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.ConnectionProvider;
import member.dao.MemberDao;
import service.Service;

public class MemberMypageServiceImpl implements Service {

	MemberDao dao;

	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {

		

		return "/WEB-INF/views/member/memberMypage.jsp";
	}

}
