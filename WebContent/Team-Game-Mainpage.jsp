<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>

<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
 <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<style>
	.hd-nav { }
	.hd-nav ul li a { font-weight: bold; font-size: 16px; }
   
    .big {
        background: url("./Img-Folder/sinnnosuke2.png");
        opacity: 0.5;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 90vh;
    }



    #center {
        width: 700px;
        height: 350px;
        position: relative;
        margin: -350px;
        top: -22%;

        left: 45%;


    }

    #image-container {

        width: 85%;
        height: auto;
        opacity: 1;
        border-radius: 20px;
        float: right;

    }
</style>
</head>
<body class="d-flex vw-100 vh-100 text-center flex-column justify-content-between">
    <header>
        <nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark">
            <div class="container-fluid">
                <!-- 수정: 로고를 클릭하면 홈 페이지로 이동 -->
                <a class="navbar-brand" href="teamgamemainpage.do">메인페이지</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll"
                    aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse hd-nav" id="navbarScroll">
                    <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
                        <li class="nav-item">
                            <!-- 수정: 로또 페이지로 이동하는 링크 -->
                            <a class="nav-link active" aria-current="page" href="teamlotto.do">로또</a>
                        </li>
                        <li class="nav-item">
                            <!-- 수정: 가위바위보 페이지로 이동하는 링크 -->
                            <a class="nav-link active" aria-current="page" href="teamrsp.do">가위바위보</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="list.do">홈으로</a>
                        </li>
                    </ul>
                    <form class="d-flex">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">search</button>
                    </form>
                </div>
            </div>
        </nav>
    </header>

    <main>
        <div class="big">

        </div>
        <div id="center">
            <img id="image-container" src="./Img-Folder/sinnnosuke.jpg" alt="My Image">
        </div>
    </main>

</body>
</html>