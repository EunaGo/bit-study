<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Jekyll v4.0.1">
<title>마이페이지</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/4.5/examples/carousel/">

<!-- Bootstrap core CSS -->
<link rel='stylesheet'
	href='<c:url value="/assets/dist/css/bootstrap.css"/>'>
<link rel='stylesheet' href='<c:url value="/css/default.css"/>'>
<!-- Custom styles for this template -->
<link href='<c:url value="/css/carousel.css"/>' rel="stylesheet">
</head>
<body>

	<%@ include file="/WEB-INF/views/include/header.jsp"%>
	<br>
	<br>
	<br>
	<div class="container">
		<div class="row mb-2">
			<div class="col-md-6">
				<div
					class="row no-gutters border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
					<div class="col p-4 d-flex flex-column position-static">
						<strong class="d-inline-block mb-2 text-primary">프로필</strong>
						<h3 class="mb-0">
							<닉네임>
						</h3>
						<div class="mb-1 text-muted">
							<지역 (ex:성산동)>
						</div>
						<p class="card-text mb-auto">This is a wider card with
							supporting text below as a natural lead-in to additional content.</p>
						<a href="#" class="stretched-link">프로필 수정하기</a>
					</div>
					<div class="col-auto d-none d-lg-block"></div>
				</div>
			</div>
			<div class="col-md-6">
				<div
					class="row no-gutters border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
					<div class="col p-4 d-flex flex-column position-static">
						<strong class="d-inline-block mb-2 text-success">거래 내역</strong>

						<div class="row mb-2">
							<div class="col-lg-6">
								<svg class="bd-placeholder-img rounded-circle" width="100"
									height="100" xmlns="http://www.w3.org/2000/svg"
									preserveAspectRatio="xMidYMid slice" focusable="false"
									role="img" aria-label="Placeholder: 100x100">
									<title>Placeholder</title><rect width="100%" height="100%"
										fill="#777" />
									<text x="50%" y="50%" fill="#777" dy=".3em">140x140</text></svg>
									<a href="${pageContext.request.contextPath}/member/reqhistory.do">요청 내역</a>
							</div>
							<div class="col-lg-6">
								<svg class="bd-placeholder-img rounded-circle" width="100"
									height="100" xmlns="http://www.w3.org/2000/svg"
									preserveAspectRatio="xMidYMid slice" focusable="false"
									role="img" aria-label="Placeholder: 100x100">
									<title>Placeholder</title><rect width="100%" height="100%"
										fill="#777" />
									<text x="50%" y="50%" fill="#777" dy=".3em">140x140</text></svg>
									<a href="${pageContext.request.contextPath}/member/rnthistory.do">대여 내역</a>
							</div>
						</div>
						<a href="#">Continue reading</a>
					</div>
					<div class="col-auto d-none d-lg-block"></div>
				</div>
			</div>
		</div>
		<div class="row mb-2">
		<div class="col-md-6">
				<div
					class="row no-gutters border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
					<div class="col p-4 d-flex flex-column position-static">
						<strong class="d-inline-block mb-2 text-primary">동네 설정</strong>
						<h3 class="mb-0">
							<동네 설정>
						</h3>
						<div class="mb-1 text-muted">
							<지역 (ex:성산동)>
						</div>
						<p class="card-text mb-auto">This is a wider card with
							supporting text below as a natural lead-in to additional content.</p>
						<a href="#" class="stretched-link">동네 수정하기</a>
					</div>
					<div class="col-auto d-none d-lg-block"></div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="/WEB-INF/views/include/footer.jsp"%>
</body>
</html>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script>
	window.jQuery
			|| document
					.write('<script src="<c:url value='/assets/js/vendor/jquery.slim.min.js'/>"><\/script>')
</script>
<script src="<c:url value='/assets/dist/js/bootstrap.bundle.js'/>"></script>
</body>
