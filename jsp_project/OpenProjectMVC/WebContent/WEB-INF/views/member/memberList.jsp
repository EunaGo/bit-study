<%@page import="member.model.MemberListView"%>
<%@page import="member.service.MemberListServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/default.css">
<style>
table {
	border: 3px solid #444444;
	border-collapse: collapse;
}

tr, td {
	border: 3px solid #444444;
}

.currentPage {
	font-size: 1.5em;
	font-weight: bold;
}

</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp"%>
	<h1 class="subtitle">회원 전체 리스트</h1>

	<%-- ${listView} --%>

	<c:if test="${not empty listView.memberList}">

		<table>

			<th>idx</th>
			<th>uid</th>
			<th>upw</th>
			<th>uname</th>
			<th>uphoto</th>
			<th>regdate</th>
			<th>delete</th>
			<c:forEach items="${listView.memberList}" var="member">

				<tr>
					<td>${member.idx}</td>
					<td>${member.uid}</td>
					<td>${member.upw}</td>
					<td>${member.uname}</td>
					<td><img src="<c:url value="${member.uphoto}"/>" width=50
						height=50></td>
					<td>${member.regdate}</td>
					<td><a href="memberDelete.do?idx=${member.idx}">삭제</a> <a
						href="memberEditForm.do?idx=${member.idx}">수정</a></td>
				</tr>

			</c:forEach>

		</table>
	</c:if>

	<c:if test="${listView.pageTotalCount > 0}">

		<div class="paging">
			<c:forEach begin="1" end="${listView.pageTotalCount}" var="num">
				<a href="memberList.do?page=${num}"
					${listView.currentPageNumber eq num? 'class="currentPage"':''}>[
					${num} ]</a>
			</c:forEach>
		</div>

	</c:if>
	<%@ include file="/WEB-INF/views/include/footer.jsp"%>
</body>
</html>