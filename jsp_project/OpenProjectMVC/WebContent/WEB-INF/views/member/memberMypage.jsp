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

</head>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp"%>
		<c:if test="${!empty result}">
		${result}
		</c:if>
	<h1>마이페이지</h1>
	${loginResult}
	<a href="${pageContext.request.contextPath}/member/memberLogout.do">로그아웃</a>
	<%@ include file="/WEB-INF/views/include/footer.jsp"%>
</body>
</html>