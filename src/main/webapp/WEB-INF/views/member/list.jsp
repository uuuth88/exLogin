<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<th>아이디</th>
		<th>이 름</th>
		<th>이메일</th>
		<th>가입일</th>
	</tr>
	<c:forEach items="${memberlist }" var="member">
		<tr>
			<td><c:out value="${member.member_id }"/></td>
			<td><c:out value="${member.member_name }"/></td>
			<td><c:out value="${member.member_email }"/></td>
			<td><c:out value="${member.regdate }"/></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>