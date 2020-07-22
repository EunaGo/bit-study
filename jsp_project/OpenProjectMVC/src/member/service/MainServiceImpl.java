package member.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Service;

public class MainServiceImpl implements Service {

	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {

			String page = "/WEB-INF/views/member/main.jsp";
			return page;
	
	}

}
