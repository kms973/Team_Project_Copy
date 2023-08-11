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
    
  body {
    margin: 0; /* 본문 전체 여백 제거 */
    padding: 0; /* 본문 전체 여백 제거 */
    overflow: hidden; /* 스크롤을 제한하여 내용이 페이지를 벗어나지 않도록 함 */
  }
  .center-table {
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 100vh; /* 페이지 높이의 최소값 만큼 표시 */
  }
  table {
    border-collapse: collapse;
    border: 2px solid black; /* 테두리 스타일 지정 */
    width: 600px; /* 테이블 폭 설정 */
      margin: 10vh auto 25vh;
  }

        
  th, td {
    border: 1px solid black; /* 셀 테두리 스타일 지정 */
    padding: 8px; /* 셀 내용과 테두리 사이의 간격 */
    text-align: left; /* 셀 내용 왼쪽 정렬 */
  }
  th:first-child,
  td:first-child {
    width: 40%; /* 좌우 넓이 조절 */
  }
  
  /* 두 번째 열의 셀 넓이 조절 */
  th:nth-child(2),
  td:nth-child(2) {
    width: 60%; /* 좌우 넓이 조절 */
  }
 input[type="text"] {
    width: 365px; /* 입력란이 표의 넓이를 차지하도록 설정 */
    box-sizing: border-box; /* padding과 border를 포함한 넓이로 설정 */
    
  }  
   footer {
    position: absolute;
    bottom: 0;
    left: 0;
    width: 100%;
    height: 60px;
    background: #ccc;
  }
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
                        <form action="creatememberform.do">
                            <a class="nav-link" href="creatememberform.do">회원생성</a>
                        </form>
                    </li>
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
                        <a class="nav-link" href="list.do">홈으로</a>
                    </li>
                </ul>
                
            </div>
        </nav>
    </header>
    <main>
    <div class="center-table" >
      <form action = "createmember.do" method = "GET">
      <table>
   <tr>
   <td>회원번호</td>
   <td><input type="text" name="custNo" value="${custNo}"><br></td>
   </tr>
   <tr>
   <td>회원성명</td>
   <td><input type="text" name="custName"><br></td>
   </tr>
   <tr>
   <td>회원전화</td>
   <td><input type="text" name="phone"><br></td>
   </tr>
   <tr>
   <td>회원주소</td>
   <td><input type="text" name="address"><br></td>
   </tr>
   <tr>
   <td>가입일자</td>
   <td><input type="text" name="joinDate" value="${joinDate}"><br></td>
   </tr>
   <tr>
   <td>고객등급<br>(A:VIP, B:일반, C:직원)</td>
   <td><input type="text" name="grade"><br></td>
   </tr>
   <tr><td>도시코드</td>
   <td><input type="text" name="city"><br></td>
   </tr>
   <tr>
   <td><input type="submit" value="등록"></td>
   </tr>
   </table>
   </form>
   </div>
   
    </main>
    <footer class="mt-5 py-3 text-center">
        <p>Address: 123 Main Street, City, Country</p>
    </footer>
    <!-- 부트스트랩과 관련된 스크립트 파일 링크 추가 -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>