<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>에러가 발생했습니다.</h1>
	
	<h3>
	에러 타입: <%= exception.getClass().getSimpleName() %> <br>
	에러 메세지: <%= exception.getMessage() %> <br>
	<%= exception.getStackTrace() %>
	</h3>
	
	<a href="index.jsp">홈으로 가기</a>
</body>
</html>