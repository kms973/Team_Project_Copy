<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<meta charset="UTF-8">
<title>메인페이지</title>
<!-- 부트스트랩 CDN 링크 추가 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" href="./css/style.css">
<!-- 부트스트랩과 관련된 스크립트 파일 링크 추가 -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
 <header>
	<!-- 내비게이션 바 -->
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	    <a class="navbar-brand" href="list.do">메인페이지</a>
	    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
	        aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
	        <span class="navbar-toggler-icon"></span>
	    </button>
	    <div class="collapse navbar-collapse hd-nav" id="navbarNav">
	        <ul class="navbar-nav ml-auto">
	            <li class="nav-item"><a class="nav-link" href="teamgamemainpage.do">게임사이트</a></li>
	            <li class="nav-item"><a class="nav-link" href="teamvote.do">투표</a></li>
	            <li class="nav-item"><a class="nav-link" href="teamhomeshopping.do">홈쇼핑</a></li>
	            <li class="nav-item"><a class="nav-link" href="teamgolf.do">골프연습장 회원관리</a></li>
	        </ul>
	    </div>
	</nav>
</header>
    <main>
        <div class="img_box d-flex w-75 justify-content-between">
            <form action="teamgamemainpage.do">
                <button type="submit" class="clickable-image1">
                    <img src="./Img-Folder/game.png" width="180" height="180">
                </button>
            </form>

            <!-- 두 번째 이미지와 링크 -->
            <form action="teamvote.do">
                <button type="submit" class="clickable-image2">
                    <img src="./Img-Folder/vote.png" width="280" height="180">
                </button>
            </form>

            <!-- 세 번째 이미지와 링크 -->
            <form action="teamhomeshopping.do">
                <button type="submit" class="clickable-image3">
                    <img src="./Img-Folder/shopping.png" width="180" height="180">
                </button>
            </form>

            <!-- 네 번째 이미지와 링크 -->
            <form action="teamgolf.do">
                <button type="submit" class="clickable-image4">
                    <img src="./Img-Folder/golf.png" width="280" height="180">
                </button>
            </form>
        </div>
          
    </main>
    <footer class="mt-5 py-3 text-center">
        <p>Address: 123 Main Street, City, Country</p>
    </footer>
</body>
</html>