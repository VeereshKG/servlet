<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Driving Licence Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">

        <a class="navbar-brand fw-bold" href="index.jsp">Driving Licence Portal</a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#nav">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="nav">
            <ul class="navbar-nav ms-auto">

                <li class="nav-item">
                    <a class="nav-link" href="index.jsp">Home</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link active" href="DrivingLicenceForm.jsp">Apply</a>
                </li>


            </ul>
        </div>

    </div>
</nav>

<div class="container mt-5">
    <div class="card shadow-lg p-2 border-0 rounded-2">
        <h3 class="text-center text-primary">Driving Licence Application Form</h3>

        <form action="licence" method="post" class="mt-4">

            <div class="mb-3">
                <label>Name</label> <span style="color:red">*</span>
                <input type="text" name="name" class="form-control" required>
            </div>

            <div class="mb-3">
                <label>Age</label> <span style="color:red">*</span>
                <input type="number" name="age" class="form-control" required>
            </div>

            <div class="mb-3">
                <label>Address</label> <span style="color:red">*</span>
                <input type="text" name="address" class="form-control" required>
            </div>

            <div class="mb-3">
                <label>Aadhar No </label> <span style="color:red">*</span>
                <input type="text" name="aadhar" class="form-control" required>
            </div>

            <div class="mb-3">
                <label>Mobile </label> <span style="color:red">*</span>
                <input type="text" name="mobile" class="form-control" required>
            </div>

            <div class="d-flex justify-content-center gap-3 mt-3">
                <button type="submit" class="btn btn-primary px-4">Submit</button>
                <button type="reset" class="btn btn-danger px-4">Clear</button>
            </div>
            <div class="d-flex justify-content-center gap-3 mt-3">
                <h1 style="color:red;">${error}</h1>
                <h1 style="color:red;">${aadharerror}</h1>
            </div>
        </form>
    </div>
</div>

</div>

</body>
</html>
