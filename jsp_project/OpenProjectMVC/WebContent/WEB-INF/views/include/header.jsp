<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
	<h1 id="header">Open Project</h1>
	<ul id="nav">
		
		<li><a href="${pageContext.request.contextPath}/member/memberRegForm.do">회원가입</a></li>
		
		<c:if test="${!empty loginInfo}">
		<li><a href="<c:url value="member/logout.jsp"/>">로그아웃</a></li>
		</c:if>
		
		<%-- <c:if test="${empty loginInfo}">
		<li><a href="<c:url value="/member/loginForm.jsp"/>">로그인</a></li>
		</c:if> --%>
		<li><a href="${pageContext.request.contextPath}/member/memberLogForm.do">로그인</a></li>
		<c:if test="${!empty loginResult }">
		<li><a href="${pageContext.request.contextPath}/member/memberMypage.do">마이페이지</a></li>
		</c:if>
		<li><a href="${pageContext.request.contextPath}/member/Guestbook.do">방명록(비회원)</a></li>
		<li><a href="${pageContext.request.contextPath}/member/memberGuestbook.do">방명록(회원제)</a></li>
		<li><a href="${pageContext.request.contextPath}/member/memberList.do">회원리스트</a></li>
	</ul>