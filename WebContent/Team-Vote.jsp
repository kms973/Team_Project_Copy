<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <meta charset="UTF-8">
    <title>투표</title>
    <!-- 부트스트랩 CDN 링크 추가 -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
    .hd-nav { }
   .hd-nav ul li a { font-weight: bold; font-size: 16px; }

        /* 표 스타일링 */
   
       footer { position: absolute; bottom: 0; left: 0; width: 100%; height: 60px; background: #ccc; }
 
        table {
            border-collapse: collapse;
            width: 700px; /* 전체 표 너비 수정 */
            margin: 130px auto; /* 가운데 정렬 */
        }

        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: center;
        }

        th {
            background-color: #f2f2f2;
        }
        .right-column {
            width: 1000px; /* 오른쪽 열의 셀 넓이 지정 */
        }
      #image-container {
      width: 100%;
      height: 600px;
      
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
                        <a class="nav-link" href="list.do">홈으로</a>
                    </li>
                </ul>
                
            </div>
        </nav>
    </header>
    <main>
   <div id="center">
            <img id="image-container" src="./Img-Folder/vote.jpg" alt="My Image">
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