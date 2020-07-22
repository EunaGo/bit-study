package member.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jdbc.ConnectionProvider;
import member.dao.MemberDao;
import member.model.LoginInfo;
import service.Service;

public class MemberMypageServiceImpl implements Service {

	MemberDao dao;

	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {
		
		LoginInfo logininfo = null;
		
		HttpSession session = request.getSession();
		logininfo = (LoginInfo)session.getAttribute("loginResult");
		System.out.println("logininfo: "+logininfo);

		
		if(logininfo == null) {
			
			return "/member/memberLogForm.do";
		} 


		return "/WEB-INF/views/member/memberMypage.jsp";
	}

}
