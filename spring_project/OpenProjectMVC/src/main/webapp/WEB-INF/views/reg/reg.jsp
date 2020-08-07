<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%= request.getContextPath() %>/resources/css/default.css">

</head>
<body>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
	<h1>회원가입</h1>
	
	${regRequest}
<%@ include file="/WEB-INF/views/include/footer.jsp" %>	
</body>
</html>