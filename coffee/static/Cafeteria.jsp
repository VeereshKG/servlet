<!DOCTYPE html>
<html>
<head>
    <title>Cafeteria Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light p-4">

<h2 class="text-center mb-4">Cafeteria Details</h2>

<div class="d-flex justify-content-center">
    <div class="card shadow-lg p-4" style="width: 28rem;">
        <form action="cafeteria" method="post">

            <label class="form-label">Cafeteria Name</label>
            <input type="text" class="form-control mb-2" name="name" required>

            <label class="form-label">Location</label>
            <input type="text" class="form-control mb-2" name="location" required>

            <label class="form-label">Type</label>
            <input type="text" class="form-control mb-2" name="type" required>

            <label class="form-label">Price</label>
            <input type="number" class="form-control mb-2" name="price" required>

            <label class="form-label">Franchise Name</label>
            <input type="text" class="form-control mb-2" name="franchise" required>

            <label class="form-label">Owner Name</label>
            <input type="text" class="form-control mb-2" name="owner" required>

            <label class="form-label">GST No</label>
            <input type="text" class="form-control mb-3" name="gst" required>

            <button class="btn btn-primary w-100">Submit</button>
        </form>
    </div>
</div>

</body>
</html>
