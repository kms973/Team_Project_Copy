<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>

<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>

<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Rock-Paper-Scissors</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
  

    <style>
    .hd-nav { }
	.hd-nav ul li a { font-weight: bold; font-size: 16px; }

        #computer img {
            width: 142px;
            height: 200px;
        }

        #scissors {
            background-color: #60c664;
            color: white;
            padding: 10px 20px;
            font-size: 16px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        #scissors:hover {
            background-color: #ffffff;
            color: rgb(0, 0, 0);
        }

        #rock {
            background-color: #60c664;
            color: white;
            padding: 10px 20px;
            font-size: 16px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        #rock:hover {
            background-color: #ffffff;
            color: rgb(0, 0, 0);
        }

        #paper {
            background-color: #60c664;
            color: white;
            padding: 10px 20px;
            font-size: 16px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        #paper:hover {
            background-color: #ffffff;
            color: rgb(0, 0, 0);
        }



        .btn:hover {
            position: relative;
        }


        .btn:hover::after {
            content: "";
            display: block;
            position: absolute;
            top: -40px;
            left: 50%;
            transform: translateX(-50%);
            width: 50px;
            height: 50px;
            background-size: cover;
            opacity: 0.7;
            border-radius: 50%;
        }

        #scissors:hover::after {
            content: "";
            display: block;
            position: absolute;
            top: -40px;
            left: 50%;
            transform: translateX(-50%);
            width: 50px;
            height: 50px;
            background-image: url("./Img-Folder/scissors.jpg");
            opacity: 0.7;
            border-radius: 50%;
        }

        #rock:hover::after {
            content: "";
            display: block;
            position: absolute;
            top: -40px;
            left: 50%;
            transform: translateX(-50%);
            width: 50px;
            height: 50px;
            background-image: url("./Img-Folder/rock.jpg");
            opacity: 0.7;
            border-radius: 50%;
        }

        #paper:hover::after {
            content: "";
            display: block;
            position: absolute;
            top: -40px;
            left: 50%;
            transform: translateX(-50%);
            width: 50px;
            height: 50px;
            background-image: url("./Img-Folder/paper.jpg");
            opacity: 0.7;
            border-radius: 50%;
        }
    </style>
</head>
<body class="d-flex vw-100 vh-100 text-center flex-column justify-content-between">
    <header>
        <nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="teamgamemainpage.do">메인페이지</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll"
                    aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse hd-nav" id="navbarScroll">
                    <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="teamlotto.do">로또</a>
                        </li>
                        <li class="nav-item">
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


    <body>

        <div id="computer"></div>
        <div id="rspbottun">
            <button id="scissors" class="btn">가위</button>
            <button id="rock" class="btn">바위</button>
            <button id="paper" class="btn">보</button>
        </div>
        <div id="score">0점</div>
        <div id="result">
            <script>

                const $computer = document.querySelector('#computer');
                const $score = document.querySelector('#score');
                const $rock = document.querySelector('#rock');
                const $scissors = document.querySelector('#scissors');
                const $paper = document.querySelector('#paper');

                let score = 0;

                const rspX = {
                    scissors: './Img-Folder/scissors.jpg',
                    rock: './Img-Folder/rock.jpg',
                    paper: './Img-Folder/paper.jpg',
                };

                const computerChoices = Object.keys(rspX);
                let computerChoice = 'scissors';

                function changeComputerHand() {
                    const randomIndex = Math.floor(Math.random() * computerChoices.length);
                    computerChoice = computerChoices[randomIndex];
                    $computer.innerHTML = '<img src="' + rspX[computerChoice] + '" alt="' + computerChoice + '" width="142" height="200">';
                }

                let intervalId = setInterval(changeComputerHand, 50);

                var scoreTable = {
                    rock: 0,
                    scissors: 1,
                    paper: -1
                };
                
                var clickable = true;
                function clickButton() {
                    if (clickable) {
                        clearInterval(intervalId); //삭제하고 다시 실행
                        clickable = false; // 연타방지
                        var myChoice = event.target.id === 'rock' ? 'rock' :
                            event.target.textContent === '가위' ? 'scissors' : 'paper';

                        var message;
                        var myScore = scoreTable[myChoice];
                        var computerScore = scoreTable[computerChoice];
                        var diff = myScore - computerScore;
                        if (diff === 2 || diff === -1) {
                            score += 1;
                            message = '승리';
                        } else if ([-2, 1].includes(diff)) {
                            score -= 1;
                            message = '패배';
                        } else {
                            message = '무승부';
                        }

                        $score.textContent = message + ' / 현재 ' + score + '점';
                        setTimeout(function() {
                            clickable = true;
                            intervalId = setInterval(changeComputerHand, 50);
                        }, 1000);
                    }
                }
                $rock.addEventListener('click', clickButton);
                $paper.addEventListener('click', clickButton);
                $scissors.addEventListener('click', clickButton);

            </script>
        </div>
    </body>
</html>