package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.LoginInfo;

public class IndexServiceImpl implements Service {

	@Override
	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session=request.getSession();
		
		session.setAttribute("loginResult", null);

		String page = "/WEB-INF/views/member/main.jsp";
		return page;
	}

}