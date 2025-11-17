<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="p-4 bg-light">


<div class="card shadow text-center">
    <div class="card-header bg-dark text-white">
        <i class="bi bi-cup-hot-fill fs-1"></i>
        <h4 class="mt-2">Coffee Details Saved Successfully</h4>
    </div>
    <div class="card-body">
        <p><strong>Coffee Type :${type}</strong></p>
        <p><strong>Price :${price}</strong></p>
        <p><strong>Quantity :${quantity}</strong></p>
        <p><strong>Farmer :${farmer}</strong></p>
        <p><strong>Location :${location}</strong></p>
        <p><strong>Zip Code :${zip}</strong></p>
        <h3 style="color:green;">Total Cost : ${TotalCost}</h3>
    </div>
</div>
</body>
</html>
