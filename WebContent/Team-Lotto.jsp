<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>

<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Lotto Generator</title>

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
 

  <style>
    .hd-nav { }
	.hd-nav ul li a { font-weight: bold; font-size: 16px; }

    .container {
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      height: 90vh;
    }

    h1 {
      color: #000000;

      font-family: Georgia, serif;
      font-size: 50px;
      text-shadow: 2px 2px 15px #f7ff01;
    }

    .numbers {
      display: flex;
      justify-content: center;
      align-items: center;
      margin: 20px 0;
    }

    .number {
      display: flex;
      justify-content: center;
      align-items: center;
      width: 70px;
      height: 70px;
      border-radius: 50%;
      background-color: #00ff00;
      color: #000000;
      font-size: 20px;
      margin: 0 5px;
      box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.2);
      animation: moveBg 12s infinite;
    }

    
    .generate-btn {
      background-color: #e4ffe5;
      color: #000000;
      padding: 10px 20px;
      border: none;
      border-radius: 5px;
      font-size: 16px;
      cursor: pointer;
      transition: background-color 0.3s;
    }

    .generate-btn:hover {
      background-color: #4ae254;
    }


    @keyframes moveBg {
      0% {
        background-color: #fff2f2;
      }

      20% {
        background-color: #fffed2;
      }

      40% {
        background-color: #dbffde;
      }

      60% {
        background-color: #d9fff8;
      }

      80% {
        background-color: #d5eaff;
      }

      100% {
        background-color: #f5eaff;
      }
    }
  </style>

</head>
<body class="d-flex vw-100 vh-100 text-center flex-column justify-content-between">
  <header>
    <nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark">
      <div class="container-fluid">
        <a class="navbar-brand" href="Team-Game-Mainpage.jsp">메인페이지</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll"
          aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse hd-nav" id="navbarScroll">
          <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="Team-Lotto.jsp">로또</a>
            </li>
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="Team-Rsp.jsp">가위바위보</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="index.jsp">홈으로</a>
          </li>
          </ul>
          <form class="d-flex">
            <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success" type="submit">search</button>
          </form>
        </div>
      </div>
    </nav>

    <script>
      function generateRandomNumbers() {
        const numbers = new Set();
        while (numbers.size < 6) {
          const randomNumber = Math.floor(Math.random() * 45) + 1;
          numbers.add(randomNumber);
        }
        return Array.from(numbers);
      }

      function generateLottoNumbers() {
        const generatedNumbers = generateRandomNumbers();
        const numberElements = document.querySelectorAll('.number');

        numberElements.forEach((element, index) => {
          element.textContent = generatedNumbers[index].toString().padStart(2, '0');
        });
      }

      generateLottoNumbers(); 
    </script>
  </header>
  <main>

    <div class="container">
      <h1>Lotto Number Generator</h1>
      <div class="numbers" id="generatedNumbers">
        <span class="number" id="result"></span>
        <span class="number" id="result"></span>
        <span class="number" id="result"></span>
        <span class="number" id="result"></span>
        <span class="number" id="result"></span>
        <span class="number" id="result"></span>
      </div>
      <button class="generate-btn" onclick="generateLottoNumbers()">Generate Numbers</button>
    </div>

  </main>

</body>
</html>