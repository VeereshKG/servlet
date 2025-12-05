<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Insurance Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">

        <a class="navbar-brand d-flex align-items-center" href="index.jsp">
            <img src="https://www.policybazaar.com/pblife/assets/images/pb_life_1650972095.jpg"
                 alt="Logo"
                 style="height: 40px; width: auto; margin-right: 10px; border-radius: 5px;">
            Insurance Portal
        </a>

    </div>
</nav>

<div class="container mt-5 d-flex justify-content-center">
    <div class="card shadow-sm p-4" style="width: 30rem;">
        <h3 class="text-center text-primary mb-4">Insurance Details Submitted</h3>
        <h1 style="color:green;">${success}</h1>
        <h1 style="color:red;">${error}</h1>
        <h1 style="color:red;">${vehicleerror}</h1>


        <p><strong>Owner Name:</strong> ${ownerName}</p>
        <p><strong>Vehicle Number:</strong> ${vehicleNumber}</p>
        <p><strong>Vehicle Type:</strong> ${vehicleType}</p>
        <p><strong>Insurance Type:</strong> ${insuranceType}</p>
        <p><strong>Premium Amount:</strong> ${amount}</p>

        <div class="text-center mt-3">
            <a href="VehicleInsurance.jsp" class="btn btn-primary">Submit Another</a>
        </div>
    </div>
</div>

</body>
</html>
