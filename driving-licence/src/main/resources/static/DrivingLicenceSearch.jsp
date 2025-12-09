
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <title>Driving Licence Search</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">

        <a class="navbar-brand" href="index.jsp">Driving Licence Portal</a>

        <a class="navbar-brand" href="DrivingLicenceForm.jsp">Register</a>

    </div>
</nav>

<div class="container mt-5 d-flex justify-content-center">
    <div class="card shadow-sm p-4" style="width: 40rem;">

        <h2 class="text-center text-primary mb-4">Search Driving Licence</h2>

        <form action="licence" method="get">

            <div class="mb-3">
                <label class="form-label fw-bold">Aadhar Number<span class="text-danger">*</span></label>
                <input type="text" name="aadharNo" class="form-control" >
            </div>

            <div class="d-flex justify-content-center gap-3 mt-3">

                <a href="DrivingLicenceForm.jsp" class="btn btn-success">Register</a>
                <input type="submit" value="Submit" name="submit" class="btn btn-primary px-4"/>
                <input type="submit" value="clear" name="submit" class="btn btn-danger px-4" />

            </div>

        <c:if test="${dto != null}">
            <div class="mt-4 p-3 border rounded bg-light">
                <h4 class="text-success">Deatils Found</h4>
                <p><strong>Name:</strong> ${dto.name}</p>
                <p><strong>Age:</strong> ${dto.age}</p>
                <p><strong>Address:</strong> ${dto.address}</p>
                <p><strong>Aadhar No:</strong> ${dto.aadhar}</p>
                <p><strong>Mobile :</strong> ${dto.mobile}</p>

                <div class="d-flex justify-content-center mt-3">
                    <a href="edit?AadharNo=${dto.aadhar}" class="btn btn-warning">Edit</a>
                </div>
            </div>
        </c:if>
            <p class="text-danger fw-bold">${aadharerror}</p>
        </form>
    </div>
</div>

</body>
</html>
