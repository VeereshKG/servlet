<!DOCTYPE html>
<html>
<head>
    <title>BBMP Survey Application</title>

    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

    <style>
        html, body {
            height: 100%;
        }
        body {
            display: flex;
            flex-direction: column;
            margin: 0;
        }
        .content {
            flex: 1;
        }
    </style>

</head>

<body class="p-3 mb-2 bg-info text-dark">


<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">

        <a class="navbar-brand fw-bold" href="index.jsp">
            BBMP Survey</a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarNav" aria-controls="navbarNav"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">

            <ul class="navbar-nav ms-auto">

                <li class="nav-item">
                    <a class="btn btn-outline-info" href="index.jsp">Home</a>
                </li>

                <li class="nav-item">
                    <a class="btn btn-outline-info" href="Survey.jsp">Start Survey</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link disabled">About</a>
                </li>

            </ul>
        </div>

    </div>
</nav>
<div class="content">
<div class="container mt-5">
    <h2 class="text-center text-primary mb-4">BBMP Citizen Survey System</h2>

    <div class="row justify-content-center">

        <div class="col-md-4">
            <div class="card shadow p-4">
                <h4 class="text-center text-success">Start Survey</h4>
                <p class="text-center">Click below to fill the BBMP survey form.</p>
                <div class="text-center">
                    <a href="Survey.jsp" class="btn btn-primary px-4">Start Now</a>
                </div>
            </div>
        </div>
    </div>
    </div>
</div>

<footer class="bg-primary text-white mt-5">
    <div class="container py-3">
        <div class="row">
            <div class="col-md-6">
                <h6 class="fw-bold mb-0">BBMP Survey Application</h6>
            </div>
            <div class="col-md-6 text-md-end">
                <p class="small mb-0">
                    &copy; 2025 BBMP Survey | All Rights Reserved.
                </p>
            </div>
        </div>
    </div>
</footer>

</body>
</html>
