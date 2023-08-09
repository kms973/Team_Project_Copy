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
	<form action = "vote.do" method = "GET">
	주민번호<input type="text" name="vJumin"><br>
	성명<input type="text" name="vName"><br>
	투표번호<input type="text" name="mno"><br>
	투표시간<input type="text" name="vTime"><br>
	투표장소<input type="text" name="vArea"><br>
	유권자확인<input type="text" name="vConfirm"><br>
	<input type="submit" value="등록">
	</form>
	
	</table>
</body>
</html>