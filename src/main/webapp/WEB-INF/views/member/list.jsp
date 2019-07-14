<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../common/header.jsp" %>
</head>
<body>
	<!-- 네비게이션 바 -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="#">uth</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active">
					<a class="nav-link" href="#">홈 <span class="sr-only">(current)</span></a>
				</li>
				<li class="nav-item dropdown">
					<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						회원정보
					</a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
<!-- 회원 정보 변경 기능 추가하기 -->				
					<a class="dropdown-item" href="#">회원정보 변경하기</a>
<!-- /회원 정보 변경 기능 추가하기 -->				
				<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#">로그아웃</a>
				</div>
				</li>
			</ul>
<!-- AJAX 이용해 회원 찾기 기능 -->			
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">회원찾기</button>
			</form>
<!-- /AJAX 이용해 회원 찾기 기능 -->			
		</div>
	</nav>
	<!-- /네비게이션 바 -->

	<!-- 멤버 리스트 -->      
	<div class="container-fluid">
		<div class="row navbar-expand-md">
		<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
		<h2>회원목록</h2>
			<div class="table-responsive">
				<table class="table table-striped table-sm">
					<thead>
						<tr>
						<th>#</th>
						<th>아이디</th>
						<th>비밀번호</th>
						<th>이름</th>
						<th>가입일</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${memberlist }" var="member">
							<tr>
							<td>#</td>
							<td><c:out value="${member.member_id }"/></td>
							<td><c:out value="${member.member_name }"/></td>
							<td><c:out value="${member.member_email }"/></td>
							<td><c:out value="${member.regdate }"/></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</main>
		</div>
	</div>
	<!-- /멤버 리스트 -->
<%@ include file="../common/footer.jsp" %>
</body>
</html>