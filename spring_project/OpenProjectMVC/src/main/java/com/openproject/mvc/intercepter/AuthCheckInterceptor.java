package com.openproject.mvc.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthCheckInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		// 로그인 상태 확인을 위한 Session 객체 확인
		HttpSession session = request.getSession(false);	// true의 경우는 새로운 Session을 생성
		
		if(session != null && session.getAttribute("loginInfo") != null) {
			return true;
		}
		
		
		response.sendRedirect(request.getContextPath()+"/login/login");
		
		return false;
	}

	
	
}
