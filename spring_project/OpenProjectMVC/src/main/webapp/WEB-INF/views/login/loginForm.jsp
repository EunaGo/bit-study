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
	<h1>로그인 폼</h1>
	
	<form method="post">
	<table>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="uid"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="upw"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="login"></td>
		</tr>
	</table>
	</form>
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>