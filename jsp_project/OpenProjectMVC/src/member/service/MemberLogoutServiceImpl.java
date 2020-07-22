package member.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Service;

public class MemberLogoutServiceImpl implements Service {

	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {
		
			request.getSession().invalidate();

			String page = "/WEB-INF/views/member/main.jsp";
			return page;
	
	}

}
