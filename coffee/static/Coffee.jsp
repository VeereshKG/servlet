<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Coffee Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light p-4">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-8">

            <div class="card shadow-lg">
                <div class="card-header bg-primary text-white">
                    <h3 class="mb-0 row justify-content-center">Welcome</h3>
                </div>

                <div class="card-body">

                    <form class="row g-3" action="coffeeservlet" method="post">

                        <div class="col-md-4">
                            <label for="input" class="form-label">Coffee Type</label>
                            <select id="input" class="form-select" name="type" required>
                                <option selected>select</option>
                                <option value="Arabica">Arabica</option>
                                <option value="Robusta">Robusta</option>
                                <option value="Americano">Americano</option>
                                <option value="Espresso">Espresso</option>
                            </select>
                        </div>

                        <div class="col-md-6">
                            <label for="pri" class="form-label">Price (per kg)</label>
                            <input type="text" class="form-control" id="pri" name="price" required>
                        </div>

                        <div class="col-md-6">
                            <label for="qua" class="form-label">Quantity (kg)</label>
                            <input type="text" class="form-control" id="qua" name="quantity" required>
                        </div>

                        <div class="col-md-6">
                            <label for="farmer" class="form-label">Farmer</label>
                            <input type="text" class="form-control" id="farmer" name="farmer" required>
                        </div>

                        <div class="col-12">
                            <label for="inputAddress" class="form-label">Location</label>
                            <input type="text" class="form-control" id="inputAddress" name="location" required>
                        </div>

                        <div class="col-md-2">
                            <label for="inputZip" class="form-label">Zip</label>
                            <input type="number" class="form-control" id="inputZip" name="zip" required>
                        </div>

                        <div class="col-12">
                            <button type="submit" class="btn btn-primary w-100">Submit</button>
                        </div>

                    </form>

                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
