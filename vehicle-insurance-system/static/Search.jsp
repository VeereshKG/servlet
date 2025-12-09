<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <title>Vehicle Insurance Enrollment</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        .valid-input { border: 2px solid green !important; }
        .invalid-input { border: 2px solid red !important; }
    </style>
</head>

<body class="bg-light">

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">
        <a class="navbar-brand d-flex align-items-center" href="index.jsp">
            <img src="https://www.policybazaar.com/pblife/assets/images/pb_life_1650972095.jpg"
                 style="height: 40px; margin-right: 10px; border-radius: 5px;">
            Insurance Portal
        </a>
    </div>
</nav>

<div class="container mt-5 d-flex justify-content-center">
    <div class="card shadow-sm p-4" style="width: 40rem;">
        <h2 class="text-center mb-4 text-primary">Search for Vehicle Details</h2>

        <form action="insurance" method="get">

            <div class="mb-3">
                <label class="form-label fw-bold">Vehicle Number <span style="color:red">*</span></label>
                <input type="text" id="vehicleNumber" name="vehicleNumber" class="form-control"
                       placeholder="KA-01-AB-1234">
                <small id="vehicleErr"></small>
            </div>

            <div class="d-flex justify-content-center gap-3 mt-3">

                <a href="VehicleInsurance.jsp" class="btn btn-success">Register</a>
                <input type="submit" value="Submit" name="submit" class="btn btn-primary px-4"/>
                <input type="submit" value="clear" name="submit" class="btn btn-danger px-4" />

            </div>
            <c:if test="${dto != null}">
                <div class="mt-3 p-3 border rounded bg-light">
                    <h4 class="text-success">Vehicle Found</h4>
                    <p><strong>Owner Name:</strong> ${dto.ownerName}</p>
                    <p><strong>Vehicle Number:</strong> ${dto.vehicleNumber}</p>
                    <p><strong>Vehicle Type:</strong> ${dto.vehicleType}</p>
                    <p><strong>Insurance Type:</strong> ${dto.insuranceType}</p>
                    <p><strong>Amount:</strong> ${dto.amount}</p>
                    <div class="d-flex justify-content-center gap-3 mt-3">

                        <a href="edit?vehicleNumber=${dto.vehicleNumber}" class="btn btn-success">Edit</a>


                    </div>
                </div>
            </c:if>

            <p class="text-danger fw-bold">${vehicleerror}</p>
        </form>

    </div>
</div>
<script>

        const vehicleField = document.getElementById("vehicleNumber");

    function validateVehicle() {
        let value = vehicleField.value.trim();
        let regex = /^[A-Z]{2}-\d{2}-[A-Z]{2}-\d{4}$/;
        if (!regex.test(value)) {
            vehicleField.classList.add("invalid-input");
            vehicleField.classList.remove("valid-input");
            document.getElementById("vehicleErr").innerHTML = "Enter valid vehicle number";
            document.getElementById("vehicleErr").style.color = "red";
            return false;
        } else {
            vehicleField.classList.remove("invalid-input");
            vehicleField.classList.add("valid-input");
            document.getElementById("vehicleErr").innerHTML = "Valid number";
            document.getElementById("vehicleErr").style.color = "green";
            return true;
        }
    }
</script>

</body>
</html>
