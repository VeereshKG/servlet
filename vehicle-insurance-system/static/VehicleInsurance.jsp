
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Vehicle Insurance Enrollment</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        .valid-input {
            border: 2px solid green !important;
        }
        .invalid-input {
            border: 2px solid red !important;
        }
    </style>
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
<div class="container mt-5">
    <div class="card shadow-lg p-2 border-0 rounded-2">
        <h2 class="text-center mb-4 text-primary">Vehicle Insurance Enrollment</h2>

        <form id="insuranceForm" action="insurance" method="post" onsubmit="return validateForm()">

            <div class="mb-3">
                <label class="form-label fw-bold">Owner Name <span style="color:red">*</span></label>
                <input type="text" id="ownerName" name="ownerName" class="form-control"
                       placeholder="Enter owner name">
                <small id="ownerErr"></small>
            </div>

            <div class="mb-3">
                <label class="form-label fw-bold">Vehicle Number <span style="color:red">*</span></label>
                <input type="text" id="vehicleNumber" name="vehicleNumber" class="form-control"
                       placeholder="KA-01-AB-1234">
                <small id="vehicleErr"></small>
            </div>

            <div class="mb-3">
                <label class="form-label fw-bold">Vehicle Type <span style="color:red">*</span></label>
                <select id="vehicleType" name="vehicleType" class="form-select">
                    <option value="">Select</option>
                    <option value="Car">Car</option>
                    <option value="Bike">Bike</option>
                    <option value="Truck">Truck</option>
                    <option value="Auto">Auto</option>
                </select>
                <small id="typeErr"></small>
            </div>

            <div class="mb-3">
                <label class="form-label fw-bold">Insurance Type <span style="color:red">*</span></label>
                <select id="insuranceType" name="insuranceType" class="form-select">
                    <option value="">Select</option>
                    <option value="Third Party">Third Party</option>
                    <option  value="Comprehensive">Comprehensive</option>
                    <option value="Own Damage">Own Damage</option>
                </select>
                <small id="insErr"></small>
            </div>

            <div class="mb-3">
                <label class="form-label fw-bold">Premium Amount <span style="color:red">*</span></label>
                <input type="number" id="premium" name="amount" class="form-control"
                       placeholder="Enter amount">
                <small id="premiumErr"></small>
            </div>

            <div class="d-flex justify-content-center gap-3 mt-3">
                <button type="submit" class="btn btn-primary px-4">Submit</button>
                <button type="button" class="btn btn-danger px-4" onclick="clearForm()">Clear</button>
            </div>

            <div class="d-flex justify-content-center gap-3 mt-3">
                <h1 style="color:red;">${error}</h1>
                <h1 style="color:red;">${vehicleerror}</h1>
            </div>
        </form>
    </div>

</div>

<script src="VehicleInsurance.js"> </script>

</body>
</html>