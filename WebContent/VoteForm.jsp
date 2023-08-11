<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <title>투표</title>
    <!-- 부트스트랩 CDN 링크 추가 -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<style>
   .hd-nav { }
   .hd-nav ul li a { font-weight: bold; font-size: 16px; }
    footer { position: absolute; bottom: 0; left: 0; width: 100%; height: 60px; background: #ccc; }
  /* 표를 가운데로 정렬하는 스타일 */
  .center-table {
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 100vh; /* 페이지 높이의 최소값 만큼 표시 */
  }
  table {
    border-collapse: collapse;
    border: 2px solid black; /* 테두리 스타일 지정 */
    width: 440px; /* 테이블 폭 설정 */
    margin: 10vh auto 25vh; /* 수평 가운데 정렬 */
  }

        
  th, td {
    border: 1px solid black; /* 셀 테두리 스타일 지정 */
    padding: 8px; /* 셀 내용과 테두리 사이의 간격 */
    text-align: left; /* 셀 내용 왼쪽 정렬 */
  }
  th:first-child,
  td:first-child {
    width: 30%; /* 좌우 넓이 조절 */
  }
  
  /* 두 번째 열의 셀 넓이 조절 */
  th:nth-child(2),
  td:nth-child(2) {
    width: 70%; /* 좌우 넓이 조절 */
  }
 input[type="text"] {
    width: 300px; /* 입력란이 표의 넓이를 차지하도록 설정 */
    box-sizing: border-box; /* padding과 border를 포함한 넓이로 설정 */
    
  }
  body {
    overflow: hidden;
  }
</style>
</head>
<body>
<header>
        <!-- 내비게이션 바 -->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="Team-Vote.jsp">투표</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse hd-nav" id="navbarNav">
                <ul class="navbar-nav ml-auto">
               <li class="nav-item">
                        <form action="voteform.do">
                            <a class="nav-link" href="voteform.do">투표하기</a>
                        </form>
               </li>

                    <li class="nav-item">
                        <form action="votesearch.do">
                            <a class="nav-link" href="votesearch.do">투표 검색</a>
                        </form>
                    </li>
                    <li class="nav-item">
                        <form action="voteinspect.do">
                            <a class="nav-link" href="voteinspect.do">투표 검사</a>
                        </form>
                    </li>
                    <li class="nav-item">
                        <form action="voterank.do">
                            <a class="nav-link" href="voterank.do">투표 순위</a>
                        </form>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="index.jsp">홈으로</a>
                    </li>
                </ul>
                
            </div>
        </nav>
    </header>
    <main>
<div class="center-table" >
   <form action = "vote.do" method = "GET">
   <div>
   <table>
   <tr>
   <td>주민번호</td>
   <td><input type="text" name="vJumin"><br></td>
   </tr>
   <tr>
   <td>성명</td>
   <td><input type="text" name="vName"><br></td>
   </tr>
   <tr>
   <td>투표번호</td>
   <td><input type="text" name="mno"><br></td>
   </tr>
   <tr>
   <td>투표시간</td>
   <td><input type="text" name="vTime"><br></td>
   </tr>
   <tr>
   <td>투표장소</td>
   <td><input type="text" name="vArea"><br></td>
   </tr>
   <tr>
   <td>유권자확인</td>
   <td><input type="text" name="vConfirm"><br></td>
   </tr>
   <tr>
   <td><input type="submit" value="등록"></td>
   </tr>
   </table>
   </div>
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