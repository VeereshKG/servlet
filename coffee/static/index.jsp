<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Coffee Forms</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light p-5">
<div class="container text-center">
    <nav class="navbar navbar-expand-lg text-bg-primary p-3">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Features</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Pricing</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" aria-disabled="true">Disabled</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <h1 class="mb-4 text-primary">Welcome to Coffee Cafe</h1>
    <h2 class="mb-5">Select Forms</h2>

    <div class="row">
        <div class="col-4 container text-center">
            <div id="simple-list-example" class="d-flex flex-column gap-2 simple-list-example-scrollspy text-center">
                <a class="btn btn-outline-secondary" href="Coffee.jsp" target="_blank" >Click Here For Coffee Form</a>
                <a class="btn btn-outline-primary" href="CoffeeLand.jsp " target="_blank" >Click Here For CoffeeLand Form</a>
                <a class="btn btn-outline-success" href="Cafeteria.jsp" target="_blank">Click Here For Cafeteria Form</a>
                <a class="btn btn-outline-danger" href="Customer.jsp" target="_blank">Click Here For Customer Form</a>
                <a class="btn btn-outline-info" href="CustomerFeedBack.jsp" target="_blank">Click Here For Customer FeedBack</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>