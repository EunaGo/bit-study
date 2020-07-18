<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<link rel="stylesheet" href="<%= request.getContextPath() %>/css/default.css">
<style>

</style>

</head>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp" %>

	<div>
		<h1 class="subtitle">수정 페이지</h1>
		<hr>
		<form id="regForm" action="memberEdit.do" method="post" enctype="multipart/form-data">
		<input type="hidden" name="idx" value="${member.idx}">
			<table>
				<tr>
					<td>아이디(email)</td>
					<td> <input type="email" name="uid" id="uid" value="${member.uid}" disabled>			
					 </td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td> <input type="password" name="upw" value="${member.upw}"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td> <input type="text" name="uname" value="${member.uname}"> </td>
				</tr>
				<tr>
					<td>사진</td>
					<td> <input type="file" name="photo"> 
					<br>
						현재 파일 : ${member.uphoto}
						<input type="hidden" name="oldFile" value="${member.uphoto}" ></td>
				</tr>
				<tr>
					<td></td>
					<td> 
						<input type="submit" name="회원가입" value="수정">
						<input type="reset">
						
					</td>
				</tr>
			</table>
		</form>
	</div>

	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>