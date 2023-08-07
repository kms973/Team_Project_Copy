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
		

		<c:forEach var="dto" items="${voteSearch}">
			<tr>
				<td>${dto.mno}</td>
				<td>${dto.mName}</td>
				<td>${dto.pName}</td>
				<td>${dto.pSchool}</td>
				<td>${dto.mJumin}</td>
				<td>${dto.mCity}</td>
				<td>${dto.tel}</td>
			</tr>
		</c:forEach>
	
	</table>
</body>
</html>