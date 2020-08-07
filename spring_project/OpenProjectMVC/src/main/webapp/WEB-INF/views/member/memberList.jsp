<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%= request.getContextPath() %>/resources/css/default.css">
<style>
div.searchBox {
   border : 1px solid #DDD;
}
</style>

</head>
<body>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
	<h1>회원리스트</h1>
	<%-- ${memberList} --%>
	
      <div class="searchBox">
      <form id="search">
      <select name="searchType">
         <option value="id">ID</option>
         <option value="name">NAME</option>
         <option value="both">ID + NAME</option>
      </select>
      <input type="text" name="keyword">
      <input type="submit" value="검색">
      </form>
      
      </div>

	<c:if test="${not empty memberList}">

		<table border="1">
			<th>idx</th>
			<th>uid</th>
			<th>upw</th>
			<th>uname</th>
			<th>uphoto</th>
			<th>regdate</th>
			<th>delete</th>
			<c:forEach items="${memberList.memberList}" var="member">

				<tr>
					<td>${member.idx}</td>
					<td>${member.uid}</td>
					<td>${member.upw}</td>
					<td>${member.uname}</td>
					<td><img src="<c:url value="${member.uphoto}"/>" width=50
						height=50></td>
					<td>${member.regdate}</td>
					<td><a href="memberDelete?idx=${member.idx}" >삭제</a> 
					<a href="memberEditForm?idx=${member.idx}" >수정</a>
					<a href="view/${member.idx}">정보보기</a></td>
				</tr>

			</c:forEach>

		</table>
	</c:if>

	<c:if test="${memberList.pageTotalCount > 0}">

		<div class="paging">
			<c:forEach begin="1" end="${memberList.pageTotalCount}" var="num">
				<a href="memberList?page=${num}&searchType=${searchType}&keyword=${keyword}"
					${memberList.currentPageNumber eq num? 'class="currentPage"':''}>[
					${num} ]</a>
			</c:forEach>
		</div>

	</c:if>
	
<%@ include file="/WEB-INF/views/include/footer.jsp" %>	
</body>
</html>
</html>