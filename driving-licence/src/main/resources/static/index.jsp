<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Driving Licence Portal</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body class="bg-light">

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">

        <a class="navbar-brand fw-bold" href="index.jsp">Driving Licence Portal</a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#nav" aria-controls="nav" aria-expanded="false">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="nav">
            <ul class="navbar-nav ms-auto">

                <li class="nav-item">
                    <a class="nav-link active" href="index.jsp">Home</a>
                </li>
                <a class="navbar-brand d-flex align-items-center" href="DrivingLicenceSearch.jsp">Search</a>
                <li class="nav-item">
                    <a class="nav-link" href="DrivingLicenceForm.jsp">Apply</a>
            </ul>
        </div>

    </div>
</nav>


<div class="container mt-5 d-flex justify-content-center">
    <div class="card shadow-sm p-3" style="width: 28rem;">

        <h2 class="text-primary mb-3">Welcome to the Driving Licence Portal</h2>

        <div class="mt-4">
            <a href="DrivingLicenceForm.jsp" class="btn btn-primary px-4 me-3">Apply Now</a>

        </div>

    </div>
</div>

</body>
</html>
