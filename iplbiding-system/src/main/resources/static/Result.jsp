<!DOCTYPE html>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <title>Registration Result</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body class="bg-light">

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">

        <a class="navbar-brand d-flex align-items-center" href="index.jsp">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSwlZ-GokT6rTlO2ghmhwT4Vk6wJDeDtdi08g&s"
                 alt="IPL Logo"
                 style="height: 40px; width: auto; margin-right: 10px;">
            IPL Bidding Portal
        </a>

        <a class="navbar-brand" href="index.jsp">Home</a>
        <a class="navbar-brand" href="Email.jsp">Search</a>

    </div>
</nav>

<div class="container mt-5 d-flex justify-content-center">
    <div class="card shadow p-4" style="width: 35rem;">

        <div class="text-center mb-3">

        </div>
        <h1 style="color:green;">${sucess}</h1>

        <p><strong>Player Name:</strong> ${name}</p>
        <p><strong>Age:</strong> ${age}</p>
        <p><strong>Player Type:</strong> ${type}</p>
        <p><strong>State:</strong> ${state}</p>
        <p><strong>battingAvg:</strong> ${battingAvg}</p>
        <p><strong>bowlingAvg:</strong> ${bowlingAvg}</p>
        <p><strong>stumps:</strong> ${stumps}</p>

        <div class="d-flex justify-content-between">
            <a href="PlayerRegister.jsp" class="btn btn-primary">
                Register Another Player
            </a>

            <a href="index.jsp" class="btn btn-secondary">
                Home
            </a>
        </div>

    </div>
</div>

</body>
</html>
