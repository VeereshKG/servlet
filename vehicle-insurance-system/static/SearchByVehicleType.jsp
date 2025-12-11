<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <title>Vehicle Insurance Enrollment</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        .valid-input { border: 2px solid green; }
        .invalid-input { border: 2px solid red; }
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

        <form action="type" method="get">

            <div class="mb-3">
                <label class="form-label fw-bold">Vehicle Type
                    <span class="text-danger">*</span>
                </label>
                <input type="text" name="vehicletype" class="form-control">
                <small id="vehicleErr" class="text-danger"></small>
            </div>

            <div class="d-flex justify-content-center gap-3 mt-3">
                <a href="VehicleInsurance.jsp" class="btn btn-success">Register</a>
                <input type="submit" name="submit" value="Submit" class="btn btn-primary px-4"/>
                <input type="submit" name="submit" value="Clear" class="btn btn-danger px-4"/>
            </div>

            <p class="text-danger fw-bold">${errormsg}</p>

        <c:if test="${dtoList != null}">
            <table class="table table-striped table-hover mt-4">
                <thead class="table-dark">
                <tr>
                    <th>Id</th>
                    <th>Owner Name</th>
                    <th>Vehicle Number</th>
                    <th>Vehicle Type</th>
                    <th>Insurance Type</th>
                    <th>Amount</th>
                    <th>Edit</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach items="${dtoList}" var="item">
                    <tr>
                        <td>${item.id}</td>
                        <td>${item.ownerName}</td>
                        <td>${item.vehicleNumber}</td>
                        <td>${item.vehicleType}</td>
                        <td>${item.insuranceType}</td>
                        <td>${item.amount}</td>
                        <td>
                            <a href="edit?vehicleNumber=${item.vehicleNumber}"
                               class="btn btn-warning">Edit</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:if>
            <p class="text-danger fw-bold">${errormsg}</p>
        </form>
    </div>
</div>

</body>
</html>
