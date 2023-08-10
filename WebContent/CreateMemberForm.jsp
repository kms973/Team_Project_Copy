<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>


<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<meta charset="UTF-8">
  <title>홈쇼핑</title>
    <!-- 부트스트랩 CDN 링크 추가 -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
    .hd-nav { }
	.hd-nav ul li a { font-weight: bold; font-size: 16px; }

        table {
            border-collapse: collapse;
            width: 700px; /* 전체 표 너비 수정 */
            margin: 130px auto; /* 가운데 정렬 */
        }
        
    footer { position: absolute; bottom: 0; left: 0; width: 100%; height: 60px; background: #ccc; }
    </style>
</head>
<body>
    <header>
        <!-- 내비게이션 바 -->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="teamhomeshopping.do">홈쇼핑</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse hd-nav" id="navbarNav">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                     <form action="membersal.do">
                        <a class="nav-link" href="membersal.do">회원매출조회</a>
                        </form>
                    </li>
                    <li class="nav-item">
                     <form action="custlist.do">
                        <a class="nav-link" href="custlist.do">회원목록조회</a>
                        </form>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#"></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#"></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="list.do">홈으로</a>
                    </li>
                </ul>
                
            </div>
        </nav>
    </header>
    <main>
       <table width="500" border="1">
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
    </main>
    <footer class="mt-5 py-3 text-center">
        <p>HRDKOREA Copyright@ 2015 All rights reserved.
            Human Resources Development Service of Korea</p>
    </footer>
    <!-- 부트스트랩과 관련된 스크립트 파일 링크 추가 -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>