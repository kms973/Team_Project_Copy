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
	<form action = "createmember.do" method = "GET">
	회원번호<input type="text" name="custNo" value="${custNo}"><br>
	회원성명<input type="text" name="custName"><br>
	회원전화<input type="text" name="phone"><br>
	회원주소<input type="text" name="address"><br>
	가입일자<input type="text" name="joinDate" value="${joinDate}"><br>
	고객등급(A:VIP, B:일반, C:직원)<input type="text" name="grade"><br>
	도시코드<input type="text" name="city"><br>
	
	<input type="submit" value="등록">
	</form>
	
	</table>
</body>
</html>