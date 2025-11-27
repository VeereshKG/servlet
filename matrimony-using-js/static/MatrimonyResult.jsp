<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Matrimony Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<nav class="navbar navbar-expand-lg" style="background: linear-gradient(90deg,#ff512f,#dd2476);">
    <div class="container">
        <a class="navbar-brand text-white fw-bold" href="index.jsp">Matrimony</a>

        <button class="navbar-toggler text-white" type="button" data-bs-toggle="collapse"
                data-bs-target="#nav1">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="nav1">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link text-white" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-white" href="shadi">Registration</a>
                </li>
            </ul>
        </div>
    </div>
</nav>



<div class="container mt-5">
    <div class="d-flex justify-content-center">
        <div class="card shadow p-4" style="width: 32rem;">

            <h3 class="text-center text-success mb-4">Registration Successful</h3>

            <strong>Email: ${email}</strong>
            <strong>For: ${forwhom}</strong>
            <strong>Gender: ${gender}</strong>
            <strong>Date of Birth: ${dob}</strong>
            <strong>Mother Tongue: ${motherTongue}</strong>
            <strong>Religion: ${religion}</strong>
            <strong>Marital Status: ${martialStatus}</strong>
            <strong>Height: ${height} ft</strong>
            <div class="text-center mt-4">
                <a href="shadi" class="btn btn-primary me-2">Register Again</a>
            </div>

        </div>
    </div>
</div>

</body>
</html>
