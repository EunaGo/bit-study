<%@page import="member.service.MemberLoginServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/default.css">
	<style>
	body, div, h1, form {
	margin: 0;
	padding: 0;
}

h1 {
	margin: 10px;
}

#form {
	margin: 10px auto;
}

td {
	padding: 10px;
}

#btn_submit {
	padding: 10px;
	background-color: aquamarine;
	font-weight: bold;
	color: darkgreen;
	border: 1px solid #EEEEEE;
}
</style>

</head>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp"%>
	<h1>회원 로그인</h1>
	<hr>
	<form action="memberLogin.do" method="post" >
		<table id="form">

			<tr>
				<td>아이디(이메일)</td>
				<td><input type="text" name="uid" required></td>

			</tr>

			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="upw" required></td>

			</tr>

			<tr>
				<td></td>
				<td><input id="btn_submit" type="submit" value="로그인"></td>
			</tr>


		</table>
	</form>
	<%@ include file="/WEB-INF/views/include/footer.jsp"%>
</body>
</html>