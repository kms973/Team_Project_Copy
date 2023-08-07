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
		

		<c:forEach var="dto" items="${voteInspect}">
			<tr>
				<td>${dto.vName}</td>
				<td>${dto.birthday}</td>
				<td>${dto.age}</td>
				<td>${dto.gender}</td>
				<td>${dto.voteNumber}</td>
				<td>${dto.voteTime}</td>
				<td>${dto.voterInspect}</td>
			</tr>
		</c:forEach>
	
	</table>
</body>
</html>