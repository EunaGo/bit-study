<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<c:url value=""/>
<link rel="stylesheet" href="<%= request.getContextPath() %>/css/default.css">

<style>
</style>
</head>
<body>

	<%@ include file="/WEB-INF/views/include/header.jsp" %>

	<div>
	<h3>
		<c:if test="${result gt 0 && member ne null}">
			<div>
				회원가입 완료
			</div>
			${member}
		</c:if>
		
				<c:if test="${not (result gt 0 && member ne null)}">
			<div>
				회원가입 실패
			</div>
		</c:if>
		
		</h3>
	</div>

	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>