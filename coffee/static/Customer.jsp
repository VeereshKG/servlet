<!DOCTYPE html>
<html>
<head>
    <title>Customer Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light p-4">

<h2 class="text-center mb-4">Customer Coffee Order</h2>

<div class="d-flex justify-content-center">
    <div class="card shadow-lg p-4" style="width: 28rem;">

        <form action="customerservlet" method="post">

            <label class="form-label">Customer Name</label>
            <input type="text" class="form-control mb-2" name="name" required>

            <label class="form-label">Mobile Number</label>
            <input type="text" class="form-control mb-2" name="mobile" required>

            <label class="form-label">Coffee Flavour</label>
            <input type="text" class="form-control mb-2" name="flavour" required>

            <label class="form-label">Quantity</label>
            <input type="number" class="form-control mb-2" name="quantity" required>

            <label class="form-label">Payment Mode</label>
            <select class="form-select mb-3" name="payment" required>
                <option selected disabled>Select</option>
                <option value="UPI">UPI</option>
                <option value="Card">Card</option>
                <option value="Cash">Cash</option>
            </select>

            <button class="btn btn-primary w-100">Submit</button>
        </form>

    </div>
</div>

</body>
</html>
