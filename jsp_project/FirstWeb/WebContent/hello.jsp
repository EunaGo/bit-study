<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서블릿 테스트</title>
</head>
<body>

	<style>
		h1{
			background-color: red;
		}
	</style>
	
	<h1>HELLO. JSP로 응답페이지를 생성했습니다.</h1>
	<%
		Date now = new Date();
		String message = "HELLO~!!";
	%>
	<p>현재 시간 : <%=now%> </p>
	<h3><%=message%></h3>
</body>
</html>