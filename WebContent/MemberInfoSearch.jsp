<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="500" border="1">
		

		<c:forEach var="dto" items="${searchMemberInfo}">
			<tr>
				<td>${dto.registMonth}</td>
				<td>${dto.cno}</td>
				<td>${dto.cname}</td>
				<td>${dto.className}</td>
				<td>${dto.classArea}</td>
				<td>${dto.classPrice}</td>
				<td>${dto.grade}</td>
			</tr>
		</c:forEach>
	
	</table>
</body>
</html>