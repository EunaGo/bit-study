<%@page import="util.CookieBox"%>
<%@page import="model.LoginInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// 로그인 처리 
	// 아이디의 값과 비밀번호의 값을 문자열 비교해서 같으면 로그인 처리 (session 속성에 저장)
	// 1. 아이디, 비밀번호 데이터를 받는다
	// 2. 로그인을 위한 비교 : 아이디 비밀번호 문자열 비교
	// 3. 로그인 처리 : 세션에 사용자 정보를 저장
	// 4. 응답 처리 : html 로그인처리 일 때, 로그인이 되지 않았을 때
	
	String uid = request.getParameter("uid");
	String pw = request.getParameter("pw");
	String chk = request.getParameter("remember");
	
	boolean loginChk = false;
	
	if(uid.equals(pw)){
		
		LoginInfo loginInfo = new LoginInfo(uid,pw);
		session.setAttribute("loginInfo", loginInfo);
	
		loginChk = true;
	}
	
%>

<%
	if(loginChk) {
		
		String cookieName = "uid";
		String cookiepath = request.getContextPath();
		
		if(chk!=null){
			response.addCookie(CookieBox.createCookie(cookieName, uid, cookiepath, 60*60*24*365));
		} else {
			response.addCookie(CookieBox.createCookie(cookieName, uid, cookiepath, 0));
		}
		
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<h1>로그인 되었습니다.</h1>
	<h2>id : <%= uid %>, pw : <%= pw %> </h2>
	<a href="mypage/mypage.jsp">My Page</a> <a href="logout.jsp">logout</a>
</body>
</html>
<%
	} else {
%>
<script>
	alert("아이디 또는 비밀번호를 확인해주세요");
	history.go(-1);
</script>
<%
	}
%>