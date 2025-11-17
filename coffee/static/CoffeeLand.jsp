<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Coffee Land</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light p-4">

<div class="container d-flex justify-content-center">
    <div class="card shadow-lg p-4" style="max-width: 600px; width: 100%;">

        <h2 class="card-title mb-4 text-center btn btn-info w-1000">Coffee Land</h2>

        <form action="coffeeland" method="post">

            <div class="row g-3 mb-3">
                <div class="col">
                    <label class="form-label">Size by Acre</label>
                    <input type="number" class="form-control" placeholder="Size" name="size">
                </div>

                <div class="col">
                    <label class="form-label">Total Plants</label>
                    <input type="number" class="form-control" placeholder="Total plants" name="plant">
                </div>
            </div>

            <div class="row g-3 mb-3">
                <div class="col">
                    <label class="form-label">Total Yield</label>
                    <input type="text" class="form-control" placeholder="Total Yield" name="yeild">
                </div>

                <div class="col">
                    <label class="form-label">Expenditure</label>
                    <input type="number" class="form-control" placeholder="Expenditure" name="exp">
                </div>
            </div>

            <div class="row g-3 mb-3">
                <div class="col">
                    <label class="form-label">Profit Made</label>
                    <input type="text" class="form-control" placeholder="Profit Made" name="profit">
                </div>

                <div class="col">
                    <label class="form-label">Fertilizer Used</label>
                    <input type="text" class="form-control" placeholder="Fertilizer Quantity" name="fertilizer">
                </div>
            </div>

            <div class="form-check mb-3">
                <input type="checkbox" class="form-check-input" id="check" name="check" value="checked">
                <label class="form-check-label" for="check">Check me out</label>
            </div>

            <button type="submit" class="btn btn-info w-100">Submit</button>

        </form>

    </div>
</div>

</body>
</html>
