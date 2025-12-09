<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Driving Licence Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">

        <a class="navbar-brand d-flex align-items-center" href="index.jsp">
            Home
        </a>


    <span> Welcome ${sessionName} </span>
    </div>
</nav>

<div class="container mt-5 d-flex justify-content-center">
    <div class="card shadow-sm p-4" style="width: 40rem;">

        <h2 class="text-success text-center">${success}</h2>

        <h3 class="mt-4">Submitted Details</h3>

        <p><strong>Name:</strong> ${name}</p>
        <p><strong>Age:</strong> ${age}</p>
        <p><strong>Address:</strong> ${address}</p>
        <p><strong>Aadhar No:</strong> ${aadhar}</p>
        <p><strong>Mobile:</strong> ${mobile}</p>

        <div class="text-center mt-3">
        <a href="DrivingLicenceForm.jsp" class="btn btn-primary mt-3">Submit Another</a>
        </div>
    </div>
</div>

</body>
</html>
