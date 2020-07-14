<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>전송 결과</h1>
	<hr>
	<table border="1">
		<tr>
			<td>아이디</td>
			<td><%=request.getParameter("id")%></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><%=request.getParameter("pw")%></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><%=request.getParameter("name")%></td>
		</tr>
		<tr>
			<td>사진</td>
			<td><%=request.getParameter("photo")%></td>
		</tr>

		<tr>
			<td>쿠키 정보</td>
			<td>
				<%
					// Cookie: getName(), getValue()
				Cookie[] cookies = request.getCookies();
				for (int i = 0; i < cookies.length; i++) {
					out.println(cookies[i].getName() + "=" + cookies[i].getValue());
				}
				%>
			</td>
		</tr>
		<tr>
			<td>요청 정보 URL</td>
			<td><%=request.getProtocol()%> <%=request.getRequestURL()%> <%=request.getRequestURI()%>
			</td>
		</tr>
	</table>
</body>
</html>