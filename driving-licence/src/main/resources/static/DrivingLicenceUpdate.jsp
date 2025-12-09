
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update Driving Licence</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">

        <a class="navbar-brand" href="index.jsp">Driving Licence Portal</a>
        <a class="navbar-brand" href="DrivingLicenceSearch.jsp">Search</a>

    </div>
</nav>

<div class="container mt-5 d-flex justify-content-center">

    <div class="card shadow-sm p-4" style="width: 40rem;">
        <h2 class="text-center text-primary mb-4">Update Driving Licence</h2>
        <form action="" method="get" class="mt-4">

            <div class="mb-3">
                <label>Name *</label>
                <input type="text" name="name" class="form-control" value="${updateDTO.name}" >
            </div>

            <div class="mb-3">
                <label>Age *</label>
                <input type="number" name="age" class="form-control" value="${updateDTO.age}">
            </div>

            <div class="mb-3">
                <label>Address *</label>
                <input type="text" name="address" class="form-control" value="${updateDTO.address}">
            </div>

            <div class="mb-3">
                <label>Aadhar No *</label>
                <input type="text" name="aadhar" class="form-control" value="${updateDTO.aadhar}" disabled>
            </div>

            <div class="mb-3">
                <label>Mobile *</label>
                <input type="text" name="mobile" class="form-control" value="${updateDTO.mobile}">
            </div>

            <div class="d-flex justify-content-center mt-3">
                <button type="submit" class="btn btn-primary px-4">Update</button>
            </div>
        </form>


    </div>

</div>

</body>
</html>
