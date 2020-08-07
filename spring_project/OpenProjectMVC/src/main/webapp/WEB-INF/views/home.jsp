<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="<%= request.getContextPath() %>/resources/css/default.css">
</head>
<body>

	<%@ include file="/WEB-INF/views/include/header.jsp" %>

	<div>
		home
	</div>

	<%@ include file="/WEB-INF/views/include/footer.jsp" %>

</body>
</html>
