<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<<c:set value="${pageContext.request.contextPath }" var="contextPath"></c:set>
<!DOCTYPE html>
<html lang="ko">
<head>
	<title>JOIN FORM</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
	<link rel="icon" type="image/png" href="../resources/images/icons/favicon.ico"/>
	<link rel="stylesheet" type="text/css" href="../resources/vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="../resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="../resources/fonts/iconic/css/material-design-iconic-font.min.css">
	<link rel="stylesheet" type="text/css" href="../resources/vendor/animate/animate.css">
	<link rel="stylesheet" type="text/css" href="../resources/vendor/css-hamburgers/hamburgers.min.css">
	<link rel="stylesheet" type="text/css" href="../resources/vendor/animsition/css/animsition.min.css">
	<link rel="stylesheet" type="text/css" href="../resources/vendor/select2/select2.min.css">
	<link rel="stylesheet" type="text/css" href="../resources/vendor/daterangepicker/daterangepicker.css">
	<link rel="stylesheet" type="text/css" href="../resources/css/util.css">
	<link rel="stylesheet" type="text/css" href="../resources/css/main.css">
<!--===============================================================================================-->

<!-- 자바스크립트  -->

</head>
<body>
	<div class="limiter">
		<div class="container-login100" style="background-image: url('../resources/images/bg-01.jpg');">
			<div class="wrap-login100">
				<form class="login100-form validate-form" method="post" action="${contextPath }/member/join">
					<span class="login100-form-title p-b-34 p-t-27">
						J O I N
					</span>
					<div class="wrap-input100 validate-input">
						<input class="input100" type="text" name="id" placeholder="ID">
						<span class="focus-input100" data-placeholder="&#xf207;"></span>
					</div>
					<div class="wrap-input100 validate-input">
						<input class="input100" type="password" name="pass" placeholder="Password">
						<span class="focus-input100" data-placeholder="&#xf191;"></span>
					</div>
					<div class="wrap-input100 validate-input">
						<input class="input100" type="text" name="name" placeholder="Name">
						<span class="focus-input100" data-placeholder="&#xf191;"></span>
					</div>
					<div class="wrap-input100 validate-input">
						<input class="input100" type="text" name="email" placeholder="Doe@uth.com">
						<span class="focus-input100" data-placeholder="&#xf191;"></span>
					</div>
					<div class="container-login100-form-btn">
<!-- 자바스크립트 구현 -->					
						<button class="login100-form-btn" onclick="">
							회원가입
						</button>
					</div>
					<div class="text-center p-t-90">
						<a class="txt1" href="#">
							홈으로
						</a>
					</div>
				</form>
			</div>
		</div>
	</div>
<!--===============================================================================================-->
	<script src="../resources/vendor/jquery/jquery-3.2.1.min.js"></script>
	<script src="../resources/vendor/animsition/js/animsition.min.js"></script>
	<script src="../resources/vendor/bootstrap/js/popper.js"></script>
	<script src="../resources/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="../resources/vendor/select2/select2.min.js"></script>
	<script src="../resources/vendor/daterangepicker/moment.min.js"></script>
	<script src="../resources/vendor/daterangepicker/daterangepicker.js"></script>
	<script src="../resources/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="../resources/js/main.js"></script>

</body>
</html>