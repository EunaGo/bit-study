<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>

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

	<%@ include file="/include/header.jsp"%>

	<div>
		<h1>회원가입</h1>
	</div>
	<hr>
	<form>
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pw"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>사진</td>
				<td><input type="file" name="uphoto"></td>
			</tr>
			<tr>
				<td></td>
				<td><input id="btn_submit" type="submit" value="등록"> <input
					type="reset"></td>
			</tr>
		</table>
	</form>

	<%@ include file="/include/footer.jsp"%>
</body>
</html>







