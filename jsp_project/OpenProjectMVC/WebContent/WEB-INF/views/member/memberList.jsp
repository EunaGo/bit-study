<%@page import="member.model.MemberListView"%>
<%@page import="member.service.MemberListServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table td {
		padding:10px;
	}
	
	input, textarea {
		padding : 5px;
	}
	
	div.msg_box {
		width : 200px;
		border : 3px solid #333;
		margin : 5px;
		padding : 10px;
	}
	
	form {
		/* display: none; */
	}
	
	.currentPage {
		font-size: 1.5em;
		font-weight: bold;
	}
	
	
}
	
</style>
</head>
<body>
	<h1>회원 전체 리스트</h1>
	
<%-- 	<%
	int pageNum = 1;   // list.jsp?page=9
	String pageNumber = request.getParameter("page");
	if(pageNumber != null) {
		pageNum = Integer.parseInt(pageNumber);
	}
	
	MemberListServiceImpl service = MemberListServiceImpl.getInstance();
	
%>
 --%>
<%-- ${listView} --%>
	
	<c:if test="${not empty listView.memberList}">
	
	<c:forEach items="${listView.memberList}" var="member">
	
	<div class="msg_box">
		${member.idx} <br>
		${member.uid} <br>
		${member.upw}<br>
		${member.uname}<br>
		${member.uphoto}<br>
		${member.regdate}<br>
		<%-- <a href="deleteMessageConfirm.jsp?mid=${message.mid}">삭제</a> --%>
	</div>	
	
	</c:forEach>
	
	</c:if>
	
	<c:if test="${listView.pageTotalCount > 0}">
	
	<div class="paging">
	<c:forEach begin="1" end="${listView.pageTotalCount}" var="num">
	<a href="memberList.jsp?page=${num}" ${listView.currentPageNumber eq num? 'class="currentPage"':''}>[ ${num} ]</a> 
	</c:forEach>
	</div>
	
	</c:if>

</body>
</html>