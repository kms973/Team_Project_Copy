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
		

		<c:forEach var="dto" items="${searchTeachers}">
			<tr>
				<td>${dto.teacherCode}</td>
				<td>${dto.teacherName}</td>
				<td>${dto.className}</td>
				<td>${dto.classPrice}</td>
				<td>${dto.teacherRegistDate}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>